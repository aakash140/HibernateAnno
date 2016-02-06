package com.hibernate.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateApp {

	public static void main(String ...args) {
		Session session=configureHibernate();
		StoreObject store=new StoreObject();
		SelectObject select=new SelectObject();
		DeleteObject delete=new DeleteObject();
		HibernateCriteria criteria=new HibernateCriteria(); 
		store.storeObject(session);
		//criteria.addCriteria(session);
		//delete.deleteObject(session);
		//select.selectObject(session);
		select.selectObject(session);
		session.close();
	}
	public static Session configureHibernate(){
		AnnotationConfiguration configuration=new AnnotationConfiguration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
	}
}