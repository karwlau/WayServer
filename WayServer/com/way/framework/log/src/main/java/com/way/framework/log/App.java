package com.way.framework.log;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Hello world!
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/biz-*.xml" })
public class App 
{
	@Resource
	public TestService tbService;
	
    public static void main( String[] args )
    {
    	Logger log = Logger.getLogger(App.class);
        System.out.println( "Hello World!" );
        log.info("test log");
    }
    
    @Test
    public void test(){
    	tbService.pf();
    	tbService.save();
    }
}
