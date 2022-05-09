package hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Child.class)
				.addAnnotatedClass(Section.class).buildSessionFactory();

		Session session = null;
		try {
			session = factory.getCurrentSession();

//			Section section1 = new Section("Dance");
//			Child child1 = new Child("Olya", 12);
//			Child child2 = new Child("Grisha", 8);
//			Child child3 = new Child("Pavel", 9);
//			
//			section1.addChildToSection(child1);
//			section1.addChildToSection(child2);
//			section1.addChildToSection(child3);
//
//			session.beginTransaction();
//			
////			session.save(section1); 
//			session.persist(section1); // Использовать когда CascadeType не ALL
			
//*********************************************************************
//			Section section2 = new Section("Pooling");
//			Section section3 = new Section("Chess");
//			Section section4 = new Section("Math");
//			Child child4 = new Child("Igor", 10);
//			
//			child4.addSectionToChild(section2);
//			child4.addSectionToChild(section3);
//			child4.addSectionToChild(section4);
//
//			session.beginTransaction();
//
//			session.save(child4);

//*********************************************************************
//			session.beginTransaction();
//
//			Section section = session.get(Section.class, 1);
//			
//			System.out.println(section);
//			System.out.println(section.getChildren());

//*********************************************************************
//			session.beginTransaction();
//
//			Child child = session.get(Child.class, 6);
//			
//			System.out.println(child);
//			System.out.println(child.getSections());
			
//*********************************************************************
			session.beginTransaction();

			Child child = session.get(Child.class, 9);
			session.delete(child);
//*********************************************************************
//			session.beginTransaction();
//
//			Section section = session.get(Section.class, 7);
//			session.delete(section);
			
			session.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			session.close();
			factory.close();

		}
	}

}
