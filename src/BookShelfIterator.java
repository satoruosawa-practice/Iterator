public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
	public Object previous() {
		index--;
		Book book = bookShelf.getBookAt(index);
		return book;
	}
	public boolean hasPrevious() {
		if (index > 0) {
			return true;
		} else {
			return false;
		}
	}
}
