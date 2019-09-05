package hibernate;

import java.io.File;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/*
 * 1. Create New Project
 * 2. Addign Hibernate to build path
 * 3. In the Default src: create hibernate.cfg.xml
 * 4. Add Mapping Resource File: <mapping resource = "message.hbm.xml"
 * 5. Create a mapping resource file w ith the same name
 * 6. BAsed on the mapping resource
 */
public class HibernateMain {
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		long millis=System.currentTimeMillis(); 
		s1.setsName("Alex");
		s1.setsGrades(100);
		s1.setsJoinDate(new Date(millis));
		
		millis=System.currentTimeMillis(); 
		s2.setsName("Aditya");
		s2.setsGrades(50);
		s2.setsJoinDate(new Date(millis));
		
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	
		
		session.save(s1);
		session.save(s2);
		session.close();
	}
}
