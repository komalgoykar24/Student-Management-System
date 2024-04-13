package com.tka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.Library;

public class LProjection {
	
	public static void main(String[] args) 
	{
		
		Session session=new Configuration().configure().addAnnotatedClass(Library.class).buildSessionFactory().openSession();
		
		Query<Object[]> query=session.createQuery("select book_id,book_title from Library ",Object[].class);
		
		List<Object[]> list=query.list();
		
	    for (Object[] array : list) 
	    {
			System.out.print(Arrays.toString(array) + " ");
		}
		
	    
	    
	    
	}

}

