package aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudentUniversity {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		University university = context.getBean("university", University.class);
		university.addStudent();
		System.out.println("***************************************************************************************\n");
		try {
			List<Student> students = university.getStudents();
//		university.getStudents();
			System.out.println(students);
		} catch (Exception e) {
			System.out.println("было поймано исключение " + e);
		}

		context.close();

	}

}
