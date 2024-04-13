package com.tka;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.tka.Library;
public class LSaveData {
	public static void main(String[] args) {
		Session session=new Configuration().configure().addAnnotatedClass(Library.class).buildSessionFactory().openSession();
		Library library=new Library();
		library.setBook_id(508);
		library.setBook_title("y");
		library.setAuthor("Rohinton Mistry");
		library.setAvailability_status(true);
		Transaction t=session.beginTransaction();
		session.persist(library);
		t.commit();
	}

}
