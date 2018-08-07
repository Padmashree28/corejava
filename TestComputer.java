package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean1.xml");
		Computer comp=(Computer)context.getBean("comp");
		System.out.println(comp.getBrandname());
		System.out.println(comp.c.getCpubrand());
	}

}
