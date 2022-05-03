package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundLoggingAspect {

	@Around("execution(public String returnBook())")
	public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("aroundReturnBookLoggingAdvice: В библиотеку пытаются книгу");
		long begin = System.currentTimeMillis();
		Object targetMethodResult = proceedingJoinPoint.proceed();
		targetMethodResult = "Преступление и наказание"; // переименовали книгу
		
		long end = System.currentTimeMillis();
		System.out.println("aroundReturnBookLoggingAdvice: В библиотеку успешно возврнули книгу");
		System.out.println("aroundReturnBookLoggingAdvice: Метод returnBook отработал за " + (end-begin) + " (мсек)");

		return targetMethodResult;
	}
}
