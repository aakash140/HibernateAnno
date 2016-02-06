package com.hibernate.annotations;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StoreObject {

	public void storeObject(Session session) {
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		employee.setFirstName("Gaurav");
		employee.setLastName("Kumar");
		employee.setAge(30);
		employee.setSalary(35000);
		session.save(employee);
		transaction.commit();
		System.out.println("Data has been saved");
	}
}