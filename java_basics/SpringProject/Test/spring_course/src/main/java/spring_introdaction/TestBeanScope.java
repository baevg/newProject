package spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		Dog myDog = context.getBean("myPet", Dog.class);
		Dog yourDog = context.getBean("myPet", Dog.class);
		System.out.println("Переменные ссылаются на один и тот же лбъект? " + (myDog==yourDog));
		System.out.println(myDog);
		System.out.println(yourDog);
		context.close();
	}
}
