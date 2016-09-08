package com.way.framework.wSpring.imp;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.way.framework.wSpring.RandName;

@Service("randName")
public class RandNameImp implements RandName {

	@Override
	public String genName() {
		Random rand = new Random(new Date().getTime());
		return "Tammy" + rand.nextLong();
	}

}
