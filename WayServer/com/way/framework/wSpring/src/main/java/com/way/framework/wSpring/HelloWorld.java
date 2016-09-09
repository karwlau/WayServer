package com.way.framework.wSpring;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("helloBean")
public class HelloWorld {

	private RandName randName;
	private List<Object> list;
	private Set<Object> set;
	private Map<Object, Object> map;
	private Properties prop;
	private Date date;

	public void printHello() {
		System.out.println("Spring 4.3 : Hello ! " + randName.genName());
		System.out.println(list);
		System.out.println(set);
		System.out.println(map);
		System.out.println(prop);
		System.out.println(date);
	}

	@Resource
	public void setRandName(RandName randName) {
		this.randName = randName;
	}

	@Resource
	public void setList(List<Object> list) {
		this.list = list;
	}

	@Resource
	public void setSet(Set<Object> set) {
		this.set = set;
	}

	@Resource
	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	@Resource
	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Resource
	public void setDate(Date date) {
		this.date = date;
	}
	
	@PostConstruct
	public void initBean(){
		System.out.println("init bean method");
	}
	
	@PreDestroy
	public void cleanBean(){
		System.out.println("clean bean method");
	}

}
