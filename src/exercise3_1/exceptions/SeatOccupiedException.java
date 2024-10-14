package exercise3_1.exceptions;

public class SeatOccupiedException extends Exception {
	private static final long serialVersionUID = 1L;
 
	public SeatOccupiedException() {
		super("Seat is already occupied.");
	}
}
