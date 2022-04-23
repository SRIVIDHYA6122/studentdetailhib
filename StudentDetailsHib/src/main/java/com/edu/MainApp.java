package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		
		
        Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Address.class);	
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
        SessionFactory sf=conn.buildSessionFactory(reg);
        Session sess=sf.openSession();
       Transaction tx=sess.beginTransaction();
       
       Address sadd=new Address();
		sadd.setCountry("us");
		sadd.setPincode(12121);
		sadd.setState("mysom");
		sadd.setStreet("john");
		//sess.save(sadd);
	        
       Student sob=new Student();
		sob.setSname("ajay");
		sob.setScourse("amazon");
		sob.setStadd(sadd);
		sess.save(sob);
		tx.commit();
		sess.close();
        
        
       
        
	}

}
