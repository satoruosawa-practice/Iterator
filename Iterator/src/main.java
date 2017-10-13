public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("こんちは、Eclipse！");
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		Iterator it = bookShelf.iterator();
		Book book = (Book)it.current();
		System.out.println("" + book.getName());
		while (it.hasNext()) {
			book = (Book)it.next();
			System.out.println("" + book.getName());
		}
		book = (Book)it.jump(1);
		System.out.println("" + book.getName());
		while (it.hasPrevious()) {
			book = (Book)it.previous();
			System.out.println("" + book.getName());
		}
	}
}
