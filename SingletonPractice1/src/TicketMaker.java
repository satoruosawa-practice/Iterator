
public class TicketMaker {
	private static int ticket = 1000;
	private static TicketMaker ticketMaker = new TicketMaker();
	private TicketMaker() {
		
	}
	public static int getNextTicketNumber() {
		return ticket++;
	}
}
