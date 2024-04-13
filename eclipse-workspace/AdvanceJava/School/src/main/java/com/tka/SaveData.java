package com.tka;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.tka.Student;

public class SaveData {
	public static void main(String[] args) {
		Session session=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		
		//Student stud=new Student();
		Student stud=session.get(Student.class, 102);
		stud.setSid(103);
		stud.setName("Siya");
		stud.setAge(12);
		if(stud==null)
		   System.out.println("Record Not Found!!");	
		else
           System.out.println(stud.getName());
		
		//session.remove(stud);
		Transaction t=session.beginTransaction();
		
		//session.persist(stud);
		t.commit();
	}
	

}
