//package hibernate_one_to_one;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import hibernate_one_to_one.entity.Detail;
//import hibernate_one_to_one.entity.Employee;
//
//public class Test1 {
//
//	public static void main(String[] args) {
//		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
//		Session session = null;
//		try {
////			session = factory.getCurrentSession();
////
////			Employee employee = new Employee("John", "Smith", "IT", 800);
////			Detail detail = new Detail("Omsk", "54986554", "pochta@mail.ru");
////
////			employee.setEmpDetail(detail);
////			session.beginTransaction();
////
////			session.save(employee);
////			session.getTransaction().commit(); // закрытие сессии
////			System.out.println("Done!");
//
//			
//			session = factory.getCurrentSession();
//			session.beginTransaction();
//			Employee emp = session.get(Employee.class, 1);
//			System.out.println(emp.getEmpDetail());
//			
//			session.getTransaction().commit(); // закрытие сессии
//			System.out.println("Done!");
//			
//		} finally {
//			session.close();
//			factory.close();
//		}
//	}
//
//}
