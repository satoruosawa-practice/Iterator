public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int currentIndex;
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.currentIndex = 0;
	}
	public Object current() {
		Book book = bookShelf.getBookAt(currentIndex);
		return book;
	}
	public boolean hasNext() {
		if (currentIndex + 1 < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	public Object next() {
		currentIndex++;
		Book book = bookShelf.getBookAt(currentIndex);
		return book;
	}
	public boolean hasPrevious() {
		if (currentIndex > 0) {
			return true;
		} else {
			return false;
		}
	}
	public Object previous() {
		currentIndex--;
		Book book = bookShelf.getBookAt(currentIndex);
		return book;
	}
	public Object jump(int index) {
		currentIndex = index;
		Book book = bookShelf.getBookAt(currentIndex);
		return book;
	}
}
