package com.hibernate.annotations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class HibernateCriteria {
	
	public void addCriteria(Session session){
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.lt("salary", 30000));
		criteria.addOrder(Order.asc("id"));
		List<Employee> list=criteria.list();
		for(Employee employee:list)
			System.out.println(employee.getFirstName()+
					"\t"+employee.getLastName()+
					"\t"+employee.getAge()+
					"\t"+employee.getSalary());
	}
}