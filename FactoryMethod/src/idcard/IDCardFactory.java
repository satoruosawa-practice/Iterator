package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	private Hashtable database = new Hashtable();
	private int serial = 100;
	protected Product createProduct(String owner) {
		return new IDCard(serial++, owner);
	}
	protected void registerProduct(Product product) {
		IDCard card = (IDCard)product;
		database.put(card.getSerial(), card.getOwner());
	}
	public Hashtable getDatabse() {
		return database;
	}
}
