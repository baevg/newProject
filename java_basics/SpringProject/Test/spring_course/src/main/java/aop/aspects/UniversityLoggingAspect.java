package aop.aspects;

import java.util.List;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import aop.Student;

@Component
@Aspect
public class UniversityLoggingAspect {
	@Before("execution(* getStudents())")
	public void beforeGetStudentsLoggingAdvice() {
		System.out.println(
				"beforeGetStudentsLoggingAdvice: Логтиуем получение списка студентов (перед методом getStrudents)");
	}

//	@AfterReturning("execution(* getStudents())")
//	@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//	public void afterGetStudentsLoggingAdvice(List<Student> students) {
//		Student firstStudent = students.get(0);
//
//		String nameSurname = firstStudent.getNameSurname();
//		nameSurname = "Mr." + nameSurname;
//		firstStudent.setNameSurname(nameSurname);
//
//		double avgGrade = firstStudent.getAvgGrade() + 1;
////		avgGrade = avgGrade + 1;
//		firstStudent.setAvgGrade(avgGrade);
//
//		System.out.println("afterGetStudentsLoggingAdvice: Логтиуем получение списка студентов (после выполнения метода getStrudents)");
//	}

@AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
public void afterGetStudentsLoggingAdvice(Throwable exception) {
	System.out.println("afterGetStudentsLoggingAdvice: Логируем выброс исключения " + exception);
}

}
