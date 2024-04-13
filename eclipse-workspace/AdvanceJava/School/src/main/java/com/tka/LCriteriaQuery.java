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

public class LCriteriaQuery {
	public static void main(String[] args) {

		Session session=new Configuration().configure().addAnnotatedClass(Library.class).buildSessionFactory().openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Library>cr=cb.createQuery(Library.class);
		Root<Library>entityobject=cr.from(Library.class);
		cr.select(entityobject);
		Query<Library>query=session.createQuery(cr);
		List<Library>list=query.list();
		System.out.println(list);
	}

}
