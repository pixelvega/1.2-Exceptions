package exercise3_1.exceptions;

public class RowOutOfBoundsException extends Exception{
	private static final long serialVersionUID = 1L;

	public RowOutOfBoundsException (String message) {
		super(message);
	}

}
