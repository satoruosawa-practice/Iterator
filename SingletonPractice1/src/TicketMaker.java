
public class TicketMaker {
	private int ticket = 1000;
	private static TicketMaker sigleton = new TicketMaker();
	private TicketMaker() {
	}
	public static TicketMaker getInstance() {
		return sigleton;
	}
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
