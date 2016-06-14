package org.jasig.cas.adaptors.jdbc;

import java.security.GeneralSecurityException;
import java.util.Map;

import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.FailedLoginException;
import javax.validation.constraints.NotNull;

import org.jasig.cas.authentication.HandlerResult;
import org.jasig.cas.authentication.PreventedException;
import org.jasig.cas.authentication.UsernamePasswordCredential;
import org.jasig.cas.authentication.principal.SimplePrincipal;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;

/**
 * 
 * @author way
 * @date 2016-5-10 16:44:20
 * @description 基于QueryDatabaseAuthenticationHandler重写
 */
public class WayAuthenticationHandler extends AbstractJdbcUsernamePasswordAuthenticationHandler {

	@NotNull
	private String sql;

	@Override
	protected HandlerResult authenticateUsernamePasswordInternal(final UsernamePasswordCredential credential)
			throws GeneralSecurityException, PreventedException {
		final String username = credential.getUsername();
		String encryptedPassword;
		try {
			Map<String, Object> authMap = getJdbcTemplate().queryForMap(this.sql, username);
			encryptedPassword = this.getPasswordEncoder().encode(credential.getPassword(),
					String.valueOf(authMap.get("salt")));
			if (!encryptedPassword.equals(authMap.get("password"))) {
				throw new FailedLoginException("Password does not match value on record.");
			}
		} catch (final IncorrectResultSizeDataAccessException e) {
			if (e.getActualSize() == 0) {
				throw new AccountNotFoundException(username + " not found with SQL query");
			} else {
				throw new FailedLoginException("Multiple records found for " + username);
			}
		} catch (final DataAccessException e) {
			throw new PreventedException("SQL exception while executing query for " + username, e);
		}
		return createHandlerResult(credential, new SimplePrincipal(username), null);
	}

	public void setSql(final String sql) {
		this.sql = sql;
	}
}
