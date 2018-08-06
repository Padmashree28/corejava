package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("Hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Laptop l1=new Laptop();
		l1.brandname="HP";
		l1.lid=1;
		l1.price=24323.5;
		Transaction tx=session.beginTransaction();
		tx.begin();
		session.save(l1);
		tx.commit();
		System.out.println("successfully inserted 1 row");
		

	}

}
