package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibraryForAroundAdvice extends AbstractLibrary {

//	public void getBook(Book book) {
//		System.out.println("Мы берем книгу из UniLibrary - " + book.getName());
//	}

//	public void getBook() {
//		System.out.println("Мы берем книгу из UniLibrary");
//		System.out.println("-------------------------------------------");
//	}

	public String returnBook() {
		System.out.println("Мы возвращаем книгу в UniLibrary");
		return "Война и мир";
	}

	public void addBook(String person_name, Book book) {
		System.out.println("Мы добавляем книгу в UniLibrary");
		System.out.println("-------------------------------------------");
	}

	public void getMagazine() {
		System.out.println("Мы берем журнал из UniLibrary");
		System.out.println("-------------------------------------------");
	}

	public void returnMagazine() {
		System.out.println("Мы возвращаем журнал в UniLibrary");
		System.out.println("-------------------------------------------");
	}

	public void addMagazine() {
		System.out.println("Мы добавляем журнал в UniLibrary");
		System.out.println("-------------------------------------------");
	}

}
