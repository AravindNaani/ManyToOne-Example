package com.spidy.Libreary.SingleTon;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleTon {

	private static SessionFactory sFactory;
	
	private SingleTon() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(sFactory==null) {
			Configuration cnfg = new Configuration();
			cnfg.configure();
			sFactory=cnfg.buildSessionFactory();
			return sFactory;
		}
		return sFactory;
	}
}
