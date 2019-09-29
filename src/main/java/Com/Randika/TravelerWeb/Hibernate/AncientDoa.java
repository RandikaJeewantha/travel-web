package Com.Randika.TravelerWeb.Hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.Randika.TravelerWeb.Model.Place;

public class AncientDoa {

	private List<Place> theAncient;
	
	public List<Place> ancientDoa() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Place.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			theAncient = session.createQuery("from Place s where s.category='Ancient'").getResultList();
			
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
		
		return theAncient;	
	}
}
