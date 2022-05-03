package aop;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class University {
	private List<Student> students = new ArrayList<>();

	public void addStudent() {
		Student st1 = new Student("Евгений Батанов", 4, 8.8);
		Student st2 = new Student("Иванов Иван", 2, 7.7);
		Student st3 = new Student("Сидоров Сидор", 1, 7.5);
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(new Student("Student studentov", 7, 4.4));
	}

	public List<Student> getStudents() {
		System.out.println("Начало работы метода getStudents()");
		
		System.out.println(students.get(4)); // сработает исключение

		System.out.println("Information from method getStudents(): ");
		System.out.println(students);
		return students;
	}
}
