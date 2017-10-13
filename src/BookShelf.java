import java.util.Vector;
public class BookShelf implements Aggregate {
	private Vector<Book> books = new Vector<Book>();
	private int length = 0;
	public BookShelf() {}
	public Book getBookAt (int index) {
		return books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
		length++;
	}
	public int getLength() {
		return length;
	}
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
