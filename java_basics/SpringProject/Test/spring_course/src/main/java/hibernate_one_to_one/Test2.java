//package hibernate_one_to_one;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import hibernate_one_to_one.entity.Detail;
//import hibernate_one_to_one.entity.Employee;
//
///* Добавили в Detail
// * 	@OneToOne(mappedBy = "empDetail", cascade = CascadeType.ALL)
//	private Employee employee;
// */
//
//public class Test2 {
//
//	public static void main(String[] args) {
//		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
//		Session session = null;
//		try {
////			session = factory.getCurrentSession();
////
////			Employee employee = new Employee("Alex", "Ivanov", "HR", 850);
////			Detail detail = new Detail("Tomsk", "5864646514", "lexx@mail.ru");
////
////			// Добавляем работнику детали
////			employee.setEmpDetail(detail); // если это не прописать, то значение в employees для details_id будет NULL
////			detail.setEmployee(employee);
////
////			session.beginTransaction();
////			session.save(detail);
////			session.getTransaction().commit(); // закрытие сессии
////
////			System.out.println("Done!");
//
//			session = factory.getCurrentSession();
//
//			// Получаем из таблицы инфу о работнике по его деталям
//			session.beginTransaction();
//			
////			Detail detail = session.get(Detail.class, 5);
////			System.out.println(detail.getEmployee());
////			session.delete(detail);// удаляем детали и сотрудника (каскадное удаление)
//			
//			Detail detail = session.get(Detail.class, 2);
//			
//			detail.getEmployee().setEmpDetail(null); // перед удалением уст. для details_id значение NULL, иначе будет ошибка
//			session.delete(detail);// удаляем детали и сотрудника (каскадное удаление)
//			session.getTransaction().commit(); // закрытие сессии
// 
//			System.out.println("Done!");
//
//		} finally {
//			session.close();
//			factory.close();
//		}
//	}
//
//}
