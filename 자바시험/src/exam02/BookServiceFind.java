package exam02;

import java.util.List;
import java.util.Scanner;

public class BookServiceFind implements BookService {
	Scanner scanner = new Scanner(System.in);
	public void execute(BookList list) {
		String name = scanner.next();
		List<Book>li = list.findName(name);
		System.out.println(li);
		
		
	}

}
