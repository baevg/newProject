package hibernate_test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_test.entity.Employee;

public class Test4 {

	public static void main(String[] args) {
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			// Вариант 1
//			Employee emp = session.get(Employee.class, 4);
//			session.delete(emp); //delete

			
			//Вариант 2
			session.createQuery("delete Employee where name = 'Sidor'").executeUpdate();
			session.getTransaction().commit(); // закрытие сессии

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
