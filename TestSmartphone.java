package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSmartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean2.xml");
		Smartphone sm=(Smartphone)context.getBean("smart");
		System.out.println(sm.getName());
		System.out.println(sm.getPrice());
		//System.out.println(sm.getName());
		System.out.println(sm.appl1.getAppname());
		System.out.println(sm.appl1.getApptype());
	}

}
