public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("こんちは、Eclipse！");
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println("" + book.getName());
		}
		while (it.hasPrevious()) {
			Book book = (Book)it.previous();
			System.out.println("" + book.getName());
		}
	}
}
