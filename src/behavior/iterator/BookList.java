package behavior.iterator;

import java.util.LinkedList;
import java.util.List;

public class BookList implements IAggregatable {
	
	private class BookIterator implements IIterator{

		private int position = 0;
		@Override
		public Book next() {
			if(this.hasNext())
				return list.get(position++);
			else
				throw new RuntimeException("End of book list");
		}

		@Override
		public boolean hasNext() {
			if(position < list.size())
				return true;
			else
				return false;
		}
	}

	private List<Book> list;
	
	public BookList(){
		list = new LinkedList<>();
	}
	
	@Override
	public IIterator createIterator() {
		return new BookIterator();
	}
	
	public void addBook(Book aBook){
		list.add(aBook);
	}
	
	public int size(){
		return list.size();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}

}
