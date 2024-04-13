package com.tka;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.Library;
public class LPagignation {
	public List<Library> getRecords(int startingPos,int maxResult)
	{
		Session session=new Configuration().configure().addAnnotatedClass(Library.class).buildSessionFactory().openSession();
		Query<Library>query=session.createQuery("from Library ", Library.class);
		//Query<Library>query=session.createQuery("from Library order by book_id desc ", Library.class);

		query.setFirstResult(startingPos);
		query.setMaxResults(maxResult);
		List<Library>list=query.list();
		return list;
	}
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Page No:");
	int startingPos=s.nextInt();
	System.out.println("Enter No. Of Records You want To Fetch:");
	int maxResult=s.nextInt();
	LPagignation obj=new LPagignation();
	List<Library>list=obj.getRecords(startingPos, maxResult);
	for(Object l:list)
	{
		System.out.println(l);
	}
}
}
