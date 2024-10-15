package exercise3_1.exceptions;

public class SeatOutOfBoundsException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public SeatOutOfBoundsException(String message) {
		super(message);
	}

}
