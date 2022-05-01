package spring_introdaction.withJavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWithJavaCode {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigWithJavaCode.class);
		Person person = context.getBean("personsBeanJava", Person.class);
		person.callYourPet();
		context.close();
	}
}