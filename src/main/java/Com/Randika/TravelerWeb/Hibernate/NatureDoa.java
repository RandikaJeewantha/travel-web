package Com.Randika.TravelerWeb.Hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.Randika.TravelerWeb.Model.Place;

public class NatureDoa {

	private List<Place> theNature;
	
	public List<Place> natureDoa() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Place.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			theNature = session.createQuery("from Place s where s.category='Nature'").getResultList();
			
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
		
		return theNature;	
	}
}
