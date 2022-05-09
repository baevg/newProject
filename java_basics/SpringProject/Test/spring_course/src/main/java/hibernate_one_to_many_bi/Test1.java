package hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;

public class Test1 {

	public static void main(String[] args) {
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Department.class)
				.buildSessionFactory();
		Session session = null;
		try {
//			session = factory.getCurrentSession();
//			Department dep = new Department("Sales", 800, 1500);
//			Employee emp1 = new Employee("John", "Smith", 800);
//			Employee emp2 = new Employee("Helen", "Smirnova", 1500);
//			Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//			
//			dep.addEmployeeToDepartment(emp1);
//			dep.addEmployeeToDepartment(emp2);
//			dep.addEmployeeToDepartment(emp3);
//			
//			session.beginTransaction();
//			
//			session.save(dep);
//
//			session.getTransaction().commit(); // закрытие сессии
//
//			System.out.println("Done!");
			
//******************************************************************************************			
			
			session = factory.getCurrentSession();			
			session.beginTransaction();
			
			System.out.println("Get Department:");
			Department department = session.get(Department.class, 4);
			
			System.out.println("Show Department:");
			System.out.println(department);
			
			System.out.println("Show Employees of the Department:");
			System.out.println(department.getEmps());
//			
			
//			Employee employee = session.get(Employee.class, 2);
//			System.out.println(employee);
//			System.out.println(employee.getDepartment());
			
//			session.delete(employee);

//			session.getTransaction().commit(); // закрытие сессии

//			System.out.println("Done!");
			
		} finally {
			session.close();
			factory.close();
		}
	}

}
