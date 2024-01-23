package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config_lifecycle.xml");
		Samosa s1=(Samosa) context.getBean("s1");
		System.out.println(s1);
		
		//registering shutdown hook
		context.registerShutdownHook();
	}

}
