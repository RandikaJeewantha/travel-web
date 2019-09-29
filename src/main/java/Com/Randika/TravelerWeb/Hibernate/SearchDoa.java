package Com.Randika.TravelerWeb.Hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.Randika.TravelerWeb.Model.Place;
import Com.Randika.TravelerWeb.Model.Search;

public class SearchDoa {

	private List<Place> SearchPlace;
	
	public List<Place> searchPlace(Search theSearch) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Place.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			String searchKey = theSearch.getSearchKey();
			
			session.beginTransaction();
			
			SearchPlace = session.createQuery("from Place s where s.name like '%" +searchKey + "%'").getResultList();
			
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
		
		return SearchPlace;	
	}
	
	public List<Place> searchPlace(String theSearch) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Place.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			String searchKey = theSearch;
			
			session.beginTransaction();
			
			SearchPlace = session.createQuery("from Place s where s.name ='" +searchKey + "'").getResultList();
			
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
		
		return SearchPlace;	
	}
}
