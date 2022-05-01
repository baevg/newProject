package spring_introdaction.withJavaCode;

import org.springframework.stereotype.Component;

@Component("frogBean")
public class Frog implements Pet {
	public Frog() {
		System.out.println("Class Frog bean is created");
	}

	@Override
	public void say() {
		System.out.println("Ква-Ква");

	}

}
