package exercise3_1.exceptions;

public class NamePersonWrongException extends Exception {
	private static final long serialVersionUID = 1L;

	public NamePersonWrongException(String message) {
		super(message);
	}

}
