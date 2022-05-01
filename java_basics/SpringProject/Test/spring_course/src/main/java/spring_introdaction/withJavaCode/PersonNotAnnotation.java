package spring_introdaction.withJavaCode;

import org.springframework.beans.factory.annotation.Value;

public class PersonNotAnnotation {
	private Pet pet;
	@Value("${personNotAnnotation.name}")
	private String name;
	@Value("${personNotAnnotation.age}")
	private int age;

	public PersonNotAnnotation() {
		System.out.println("Class Person bean is created - default");
	}

	public PersonNotAnnotation(Pet pet) {
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

	public int getAge() {
		return age;
	}
	
	

}