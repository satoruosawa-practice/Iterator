import java.util.Vector;
public class BookShelf implements Aggregate {
	private Vector<Book> books = new Vector<Book>();
	public BookShelf(int initalSize) {
		 this.books = new Vector<Book>(initalSize);
	}
	public Book getBookAt (int index) {
		return books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
	}
	public int getLength() {
		return books.size();
	}
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
