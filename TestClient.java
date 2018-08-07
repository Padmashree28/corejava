package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
Springdemo1 sp=(Springdemo1)context.getBean("w1");
System.out.println(sp.getMsg());
	}

}


