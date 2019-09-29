package Com.Randika.TravelerWeb.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.Randika.TravelerWeb.Model.Message;

public class MessageToDB {

	public void messageToDB(Message theMessage) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Message.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			session.save(theMessage);
			
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}

	}

}
