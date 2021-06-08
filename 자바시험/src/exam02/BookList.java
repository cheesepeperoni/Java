package exam02;

import java.util.ArrayList;
import java.util.List;

public class BookList extends BookAccess {
	ArrayList<Book> books = new ArrayList<Book>();

	@Override
	public void insert(Book book) {
		books.add(book);
	}

	public List<Book> findName(String name) {
		List<Book> boo = new ArrayList<Book>();
		for (Book b : books) {
			if (b.getName().equals(name)) {
				boo.add(b);

			}
		}
		return boo;

	}

}
