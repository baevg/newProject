package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import aop.Book;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//	@Pointcut("execution(* aop.UniLibrary.*(..))")
//	private void allMethodsFromUniLibrary() {
//	}
//
//	@Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//	private void returnMagazineFromUniLibrary() {
//	}
//
//	@Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//	private void allMethodsExceptReturnMagazineFromUniLibrary() {
//	}
//	
//	@Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//	public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
//		System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: Log #10");
//	}

//	*******************************************************************************************************************************************************
//	@Pointcut("execution(* aop.UniLibrary.get*())")
//	private void allGetMethodsFromUniLibrary() {
//	}
//
//	@Pointcut("execution(* aop.UniLibrary.return*())")
//	private void allReturnMethodsFromUniLibrary() {
//	}
//
//	@Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//	private void allGetAndReturnMethodsFromUniLibrary() {
//	}
//
//	@Before("allGetMethodsFromUniLibrary()")
//	public void beforeGetLoggingAdvice() {
//		System.out.println("beforeGetLoggingAdvice: writing Log #1");
//	}
//
//	@Before("allReturnMethodsFromUniLibrary()")
//	public void beforeReturnLoggingAdvice() {
//		System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//	}
//
//	@Before("allGetAndReturnMethodsFromUniLibrary()")
//	public void beforeGetAndReturnLoggingAdvice() {
//		System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//	}
//*******************************************************************************************************************************************************

//	@Pointcut("execution(* get*())")
//	private void allGetMethods() {// если сделать public, то можно использовать в других классах и аспектах
//	}

//	@Before("allGetMethods()")
//	public void beforeGetLoggingAdvice() {
//		System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
//	}

//	@Before("allGetMethods()")
//	public void beforeGetSecurityAdvice() {
//		System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//	}

	@Before("aop.aspects.MyPointcuts.allGetMethods()")
	public void beforeGetLoggingAdvice(JoinPoint joinPoint) {

		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("methodSignature = " + methodSignature);
		System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
		System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
		System.out.println("methodSignature.getName() = " + methodSignature.getName());
		

		if (methodSignature.getName().equals("addBook")) {
			Object[] arguments = joinPoint.getArgs();

			for (Object obj : arguments) {
				if (obj instanceof Book) {
					Book myBook = (Book) obj;
					System.out.println("Информаци о книге: название - " + myBook.getName() + ", автор - "
							+ myBook.getAuthor() + ", год издания - " + myBook.getYearOfPublication());
				}else{
					System.out.println("Книгу в библиотеку добавляет " + obj);
				}
			}
		}

		System.out.println();

		System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
		System.out.println("-------------------------------------------");
	}

//*******************************************************************************************************************************************************
//	@Before("execution(public void get*())") // для всех методов начинающихся на get
//	@Before("execution(public void getBook())") // для всего где есть метод getBook()
//	@Before("execution(public void aop.UniLibrary.getBook())") // getBook для конкретного класса

//	@Before("execution(public void getBook(String))") // для всего где есть метод getBook(String)
//	@Before("execution(public void *(*))") // любой метод с любым одним параметром
//	@Before("execution(public void *(..))") // любой метод с любым количеством параметром-(0 и более)

//	@Before("execution(public void getBook(aop.Book))") 	
//	@Before("execution(public void getBook(aop.Book, ..))")
//	public void beforeGetBookAdvice() {
//		System.out.println("beforeGetBookAdvice: попытка получить книгу");
//	}

//	@Before("execution(public String returnBook())") // с указанным возвращаемым типом
//	@Before("execution(public * returnBook())") // для любого возвращаемого типа
//	@Before("execution(* returnBook())") // для любого возвращаемого типа (Модификатор доступа не является обязательным параметром)
//	@Before("execution(* *())") // будет всегда срабатывать
//	public void beforeReturnBookAdvice() {
//		System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//	}

}
