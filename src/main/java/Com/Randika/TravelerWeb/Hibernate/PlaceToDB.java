package Com.Randika.TravelerWeb.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.Randika.TravelerWeb.Model.Place;

public class PlaceToDB {

	public void placeToDB(Place thePlace) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Place.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			session.save(thePlace);
			
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}

	}

}
