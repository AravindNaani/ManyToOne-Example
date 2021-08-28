package com.spidy.Libreary.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spidy.Libreary.SingleTon.SingleTon;
import com.spidy.Libreary.entity.Book;

public class AgrigationDao {

	public void saveBooks(List<Book> books) {
		SessionFactory factory = SingleTon.getSessionFactory();
		Session session = factory.openSession();
		for(Book i:books) {
		session.save(i);
		}
		Transaction transaction = session.beginTransaction();
		transaction.commit();
	}
}
