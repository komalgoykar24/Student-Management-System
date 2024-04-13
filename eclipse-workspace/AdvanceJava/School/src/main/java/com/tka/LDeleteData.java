package com.tka;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.Library;
public class LDeleteData {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Book Name to Delete:");
		String bookTitle=s.next();
		Session session=new Configuration().configure().addAnnotatedClass(Library.class).buildSessionFactory().openSession();
		Query query=session.createQuery("delete from Library where book_title=:bookTitle" );
		query.setParameter("bookTitle",bookTitle);
		Transaction t=session.beginTransaction();
		int deleteno=query.executeUpdate();
		if(deleteno>0)
		{
			System.out.println("Successfully deleted "+ bookTitle +" detail's");
		}
		else
		{
			System.out.println("No such Book");
		}
		t.commit();
	}

}
