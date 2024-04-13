package com.tka;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.Library;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
public class LReadData {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name Of Book: ");
		String bookTitle=s.next();
		Session session=new Configuration().configure().addAnnotatedClass(Library.class).buildSessionFactory().openSession();
		//select * from Library;
		
		
		Query<Library>query=session.createQuery("from Library ");
		query.setParameter("bookTitle",bookTitle);
		List<Library>list=query.list();
		System.out.println(list);
		
	}

}
