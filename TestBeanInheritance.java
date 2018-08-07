package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Beaninheritance.xml");
		HelloWorld objA=(HelloWorld)context.getBean("helloworld");
		System.out.println(objA.getMsg1());
		System.out.println(objA.getMsg2());
		HelloIndia objB=(HelloIndia)context.getBean("helloindia");
		System.out.println(objB.getMsg1());
		System.out.println(objB.getMsg2());
		System.out.println(objB.getMsg3());
	}

}
