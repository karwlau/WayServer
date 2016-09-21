package com.way.framework.config.diamond;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;
import java.util.concurrent.Executor;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.util.StringUtils;

import com.taobao.diamond.manager.DiamondManager;
import com.taobao.diamond.manager.ManagerListener;
import com.taobao.diamond.manager.impl.DefaultDiamondManager;
import com.way.framework.config.PropertyConfig;

public class ExtendPropertyPlaceholderConfig extends PropertyPlaceholderConfigurer {

	private static Logger logger = Logger.getLogger(ExtendPropertyPlaceholderConfig.class);

	private Properties props;

	private boolean loadRemote = false;

	/**
	 * @return the loadRemote
	 */
	public boolean isLoadRemote() {
		return loadRemote;
	}

	/**
	 * @param loadRemote
	 *            the loadRemote to set
	 */
	public void setLoadRemote(boolean loadRemote) {
		this.loadRemote = loadRemote;
	}

	@Override
	protected void processProperties(ConfigurableListableBeanFactory factory, Properties props) throws BeansException {
		if (!isLoadRemote()) {
			super.processProperties(factory, props);
			this.props = props;
			PropertyConfig.load(props);
			return;
		}
		String group = props.getProperty("deploy.group", "");
		String dataId = props.getProperty("deploy.dataId", "");
		logger.debug("configuration group:" + group);
		logger.debug("configuration dataId:" + dataId);
		if (StringUtils.isEmpty(group.trim()) || StringUtils.isEmpty(dataId.trim())) {
			logger.debug("not setting configuration group or dataId");
			PropertyConfig.load(props);
		} else {
			DiamondManager manager = new DefaultDiamondManager(group, dataId, new ManagerListener() {
				/**
				 * 客户端处理数据逻辑：client process the configuration data
				 */
				@Override
				public void receiveConfigInfo(String configInfo) {
					logger.debug("diamond config info:" + configInfo);
					StringReader reader = new StringReader(configInfo);
					PropertyConfig.load(reader);
				}

				@Override
				public Executor getExecutor() {
					return null;
				}
			});
			try {
				String configInfo = manager.getAvailableConfigureInfomation(30000);
				logger.debug("diamond config info:" + configInfo);
				if (!StringUtils.isEmpty(configInfo)) {
					StringReader reader = new StringReader(configInfo);
					props.load(reader);
					PropertyConfig.load(reader);
				} else {
					logger.error("not found configuration");
				}
			} catch (IOException e) {
				logger.error(e);
			}
		}
		super.processProperties(factory, props);
		this.props = props;
		System.out.println(this.props);
	}

	public Object getProperty(String key) {
		return props.get(key);
	}
}
