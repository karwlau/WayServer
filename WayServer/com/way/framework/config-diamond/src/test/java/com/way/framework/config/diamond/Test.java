package com.way.framework.config.diamond;

import java.io.StringReader;
import java.util.concurrent.Executor;

import com.taobao.diamond.manager.DiamondManager;
import com.taobao.diamond.manager.ManagerListener;
import com.taobao.diamond.manager.impl.DefaultDiamondManager;
import com.way.framework.config.PropertyConfig;

public class Test {
	public static void main(String[] args) {

		DiamondManager manager = new DefaultDiamondManager("gp", "pri", new ManagerListener() {
			/**
			 * 客户端处理数据逻辑：client process the configuration data
			 */
			@Override
			public void receiveConfigInfo(String configInfo) {
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
			System.out.println(configInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
