package com.hibernate.annotations;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class SelectObject {

	public void selectObject(Session session) {
		Query query=session.createQuery("from Employee");
		List<Employee> list=query.list();
		for(Employee employee:list)
			System.out.println(employee.getFirstName()+
					"\t"+employee.getLastName()+
					"\t"+employee.getAge()+
					"\t"+employee.getSalary());
	}
}