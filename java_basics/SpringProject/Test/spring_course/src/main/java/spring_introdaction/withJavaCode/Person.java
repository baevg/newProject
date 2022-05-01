package spring_introdaction.withJavaCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personsBeanJava")
public class Person {
	private Pet pet;
	private String name;
	private int age;

	public Person() {
		System.out.println("Class Person bean is created - default");
	}

	@Autowired
	public Person(@Qualifier("frogBean") Pet pet) {
		System.out.println("Class Person bean is created");
		this.pet = pet;
	}
	
	public void callYourPet() {
		System.out.println("Hello my lovely Pet");
		pet.say();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
