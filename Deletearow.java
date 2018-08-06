package com.deloitte;

import java.util.List;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Deletearow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Query query=session.createQuery("from com.deloitte.Laptop");
		List listObj=query.list();
		Iterator it=listObj.iterator();
		while(it.hasNext()) {
			Laptop lt1=(Laptop)it.next();
			System.out.println(lt1.getBrandname() +" " +lt1.getLid()+ " "+lt1.getPrice());
			
		}
		
		
		

	}

}
