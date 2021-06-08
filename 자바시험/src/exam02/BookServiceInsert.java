package exam02;

import java.util.Scanner;

public class BookServiceInsert implements BookService {
	
	public void execute(BookList list) {
		Scanner scanner = new Scanner(System.in);
		String isbn = scanner.next();
		String name = scanner.next();
		String content = scanner.next();
		Book book = new Book(isbn,name,content);
		list.insert(book);
	}


	public void execute() {}
	
	
}
