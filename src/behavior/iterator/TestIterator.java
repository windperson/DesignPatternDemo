package behavior.iterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIterator {

	@Test
	public void test() {
		BookList bookList = new BookList();
		bookList.addBook(new Book("bookA"));
		bookList.addBook(new Book("bookB"));
		bookList.addBook(new Book("bookC"));
		
		for(IIterator iterator = bookList.createIterator(); iterator.hasNext();){
			System.out.println(iterator.next().getName());
		}
		
		IIterator iterator = bookList.createIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().getName());
		}
	}

}
