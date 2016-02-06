package com.hibernate.annotations;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteObject {

	public void deleteObject(Session session) {
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("delete from Employee where id=4");
		if(query.executeUpdate()==1){
			transaction.commit();
			System.out.println("Record has been successfuly deleted");
		}
		else
			System.out.println("Erroneus Query");
	}
}