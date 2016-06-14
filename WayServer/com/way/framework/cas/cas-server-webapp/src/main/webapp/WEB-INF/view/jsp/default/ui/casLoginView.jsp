<!DOCTYPE html>

<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html lang="en">
<head>
<meta charset="UTF-8" />

<title>Login</title>

<spring:theme code="standard.custom.css.file" var="customCssFile" />
<link rel="stylesheet" href="<c:url value="${customCssFile}" />" />
<link rel="icon" href="<c:url value="/favicon.ico" />"
	type="image/x-icon" />

<!--[if lt IE 9]>
    <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js" type="text/javascript"></script>
  <![endif]-->
</head>
<body id="cas">
	<div id="container">
		<div id="content">
			<div class="box" id="login">
				<form:form method="post" id="fm1" commandName="${commandName}"
					htmlEscape="true">

					<form:errors path="*" id="msg" cssClass="errors" element="div"
						htmlEscape="false" />

					<section class="row">
						<label for="username"><spring:message
								code="screen.welcome.label.netid" /></label>
						<spring:message code="screen.welcome.label.netid.accesskey"
							var="userNameAccessKey" />
						<form:input cssClass="required" cssErrorClass="error"
							id="username" size="25" tabindex="1"
							accesskey="${userNameAccessKey}" path="username"
							autocomplete="off" htmlEscape="true" />
					</section>

					<section class="row">
						<label for="password"><spring:message
								code="screen.welcome.label.password" /></label>
						<%--
      NOTE: Certain browsers will offer the option of caching passwords for a user.  There is a non-standard attribute,
      "autocomplete" that when set to "off" will tell certain browsers not to prompt to cache credentials.  For more
      information, see the following web page:
      http://www.technofundo.com/tech/web/ie_autocomplete.html
      --%>
						<spring:message code="screen.welcome.label.password.accesskey"
							var="passwordAccessKey" />
						<form:password cssClass="required" cssErrorClass="error"
							id="password" size="25" tabindex="2" path="password"
							accesskey="${passwordAccessKey}" htmlEscape="true"
							autocomplete="off" />
					</section>

					<section class="row check">
						<input id="warn" name="warn" value="true" tabindex="3"
							accesskey="<spring:message code="screen.welcome.label.warn.accesskey" />"
							type="checkbox" /> <label for="warn"><spring:message
								code="screen.welcome.label.warn" /></label>
					</section>

					<section class="row btn-row">
						<input type="hidden" name="lt" value="${loginTicket}" /> <input
							type="hidden" name="execution" value="${flowExecutionKey}" /> <input
							type="hidden" name="_eventId" value="submit" /> <input
							class="btn-submit" name="submit" accesskey="l"
							value="<spring:message code="screen.welcome.button.login" />"
							tabindex="4" type="submit" /> <input class="btn-reset"
							name="reset" accesskey="c"
							value="<spring:message code="screen.welcome.button.clear" />"
							tabindex="5" type="reset" />
					</section>
				</form:form>
			</div>

		</div>
		<!-- END #content -->

		<footer>
			<div id="copyright">
				<%-- <p>
					<spring:message code="copyright" />
				</p> --%>
				<p>
					Powered by <a href="<%="company home page url "%>">company name</a>
				</p>
			</div>
		</footer>

	</div>
	<!-- END #container -->

	<script type="text/javascript" src="/js/jquery-2.1.4/jquery.min.js"></script>
	<script type="text/javascript"
		src="/js/jquery-ui-1.11.4/jquery-ui.min.js"></script>

	<%-- 
        JavaScript Debug: A simple wrapper for console.log 
        See this link for more info: http://benalman.com/projects/javascript-debug-console-log/
    --%>
	<!-- way<script type="text/javascript" src="https://github.com/cowboy/javascript-debug/raw/master/ba-debug.min.js"></script> -->

	<spring:theme code="cas.javascript.file" var="casJavascriptFile"
		text="" />
	<script type="text/javascript"
		src="<c:url value="${casJavascriptFile}" />"></script>
</body>
</html>

