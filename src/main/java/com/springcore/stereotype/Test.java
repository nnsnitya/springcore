package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/config_stereo.xml");
		Student student = con.getBean("student", Student.class);
		System.out.println(student);
		
	}
}
