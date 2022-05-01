package com.example.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		System.getProperties().put( "server.port", 8181 );  //8181 port is set here
		SpringApplication.run(DemoApplication.class, args);
	}

}



//@SpringBootApplication
//public class MyClass {
//public static void main(String[] args) {
//    System.getProperties().put( "server.port", 8181 );  //8181 port is set here
//    SpringApplication.run(MyClass.class, args);
//}