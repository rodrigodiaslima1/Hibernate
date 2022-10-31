import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tvc.com.hibernate.demo.entity.Student;

public class App {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			// create a student object
			Student student = new Student("Paul", "Wall", "paulwall@tvc.com");
			
			// start transaction
			session.beginTransaction(); //session.getTransaction().begin();
			
			// save student
			session.save(student); //session.persist(student);
			
			// commit transaction
			session.getTransaction().commit();
			
		} finally {
			session.close();
			sessionFactory.close();
		}
		
	}
	
}
