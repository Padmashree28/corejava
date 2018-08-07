package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanCollections.xml");
CollectionExample ce=(CollectionExample)context.getBean("collectionexample");
ce.getCitylist();
ce.getCitymap();
ce.getCityset();
ce.getCityprop()
;
	}

}
