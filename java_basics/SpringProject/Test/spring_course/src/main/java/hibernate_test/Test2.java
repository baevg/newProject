package hibernate_test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_test.entity.Employee;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();

			// Получить всех работников и вывести на экран (создаем запрос)
			List<Employee> emps = session.createQuery("from Employee where name='Eugene'").getResultList();

			for (Employee e : emps) {
				System.out.println(e.getSurname());
			}

			session.getTransaction().commit(); // закрытие сессии

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
