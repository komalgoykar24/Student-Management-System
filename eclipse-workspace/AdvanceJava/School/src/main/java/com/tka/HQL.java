package com.tka;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.Student;

public class HQL {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=s.next();
		Session session=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Query<Student>query=session.createQuery("from Student where name=:name", Student.class);
		query.setParameter("name", name);
		List<Student>l=query.list();
		System.out.println(l);
	}
				}


