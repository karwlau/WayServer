package com.way.framework.log;

import org.springframework.stereotype.Service;

@Service(value="tbService")
public class TestService {
	public void pf(){
		System.out.println("pf method");
	}
	public void save(){
		System.out.println("save method");
	}
}
