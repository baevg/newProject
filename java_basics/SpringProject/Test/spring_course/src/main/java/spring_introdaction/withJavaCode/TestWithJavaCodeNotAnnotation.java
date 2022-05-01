package spring_introdaction.withJavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWithJavaCodeNotAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigWithJavaCodeNotAnnotation.class);
//		Pet frog1 = context.getBean("frogBean", Pet.class);
//		Pet frog2 = context.getBean("frogBean", Pet.class);

		PersonNotAnnotation person1 = context.getBean("personBean", PersonNotAnnotation.class);
		person1.callYourPet();
		System.out.println(person1.getName() + " " + person1.getAge());

//		frog1.say();
		context.close();

	}
}
