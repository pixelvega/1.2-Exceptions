package exercise3_1.exceptions;

public class SeatEmptyException extends Exception {
	private static final long serialVersionUID = 1L;

	public SeatEmptyException() {
		super("Seat is not reserved.");
	}
}
