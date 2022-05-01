package spring_introdaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	public static void main(String[] args) {
		System.out.println("Start @Scope");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
				
		Dog myDog = context.getBean("dog", Dog.class);
		myDog.say();
		
//		Dog yourDog = context.getBean("dog", Dog.class);
		
//		System.out.println(myDog == yourDog);
//		System.out.println(myDog);
//		System.out.println(myDog);
		context.close();
	}

}
