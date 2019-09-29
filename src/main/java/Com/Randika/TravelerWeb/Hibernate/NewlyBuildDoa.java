package Com.Randika.TravelerWeb.Hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.Randika.TravelerWeb.Model.Place;

public class NewlyBuildDoa {

	private List<Place> theNewlyBuild;
	
	public List<Place> newlyBuildDoe() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Place.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			theNewlyBuild = session.createQuery("from Place s where s.category='Newly Build'").getResultList();
			
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
		
		return theNewlyBuild;	
	}
}
