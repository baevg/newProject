package spring_introdaction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet {
	public Dog() {
		System.out.println("Dog bean is created");
	}

	@Override
	public void say() {
		System.out.println("Гав-Гав");
	}
@PostConstruct
	public void init() {
		System.out.println("Class Dog: init method");
	}
@PreDestroy
	public void destroy() {
		System.out.println("Class Dog: destroy method");

	}
}
