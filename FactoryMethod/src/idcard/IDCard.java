package idcard;
import framework.*;

public class IDCard extends Product {
	private String owner;
	private int serial;
	IDCard(int serial, String owner) {
		System.out.println(owner + "(" + serial + ")のカードを作ります。");
		this.serial = serial;
		this.owner = owner;
	}
	public void use() {
		System.out.println(owner + "(" + serial + ")のカードを使います。");
	}
	public String getOwner() {
		return owner;
	}
	public int getSerial() {
		return serial;
	}
}
