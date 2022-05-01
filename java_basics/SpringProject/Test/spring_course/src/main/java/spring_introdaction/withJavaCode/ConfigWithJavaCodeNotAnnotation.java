package spring_introdaction.withJavaCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myProperties.properties")

public class ConfigWithJavaCodeNotAnnotation {
	@Bean
	@Scope("singleton")
	public Pet frogBean() {
		return new Frog();
	}
	
	@Bean
	public PersonNotAnnotation personBean() {
		return new PersonNotAnnotation(frogBean());
	}
	
	
}
