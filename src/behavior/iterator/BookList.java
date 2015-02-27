package behavior.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookList implements IAggregatable, Iterable<Book> {
	
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

	@Override
	public Iterator<Book> iterator() {
		return new BookListJavaIterator(new BookIterator());
	}
	
	private class BookListJavaIterator implements Iterator<Book>{
		
		BookIterator _iterator = null;
		
		public BookListJavaIterator(BookIterator iterator){
			_iterator = iterator;
		}

		@Override
		public boolean hasNext() {
			return _iterator.hasNext();
		}

		@Override
		public Book next() {
			return _iterator.next();
		}

		@Override
		public void remove() {
			//optional method, don't support it in normal situation
			//http://stackoverflow.com/questions/1536273/why-iterator-remove-has-been-described-as-optional-operation
			throw new UnsupportedOperationException();
		}
		
	}

}
