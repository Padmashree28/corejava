package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("Hibernate1.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Passport pp=new Passport();
		pp.setPpid(1);
		pp.setPpname("India");
		Person p=new Person();
		p.setName("Shree");
		p.setPid(1);
		p.setPp(pp);
		Transaction tx=session.beginTransaction();
		session.save(pp);
		session.save(p);
		tx.commit();
		System.out.println("Done");
		

	}

}
