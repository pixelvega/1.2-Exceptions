package exercise3_1;

import exercise3_1.exceptions.NamePersonWrongException;
import exercise3_1.exceptions.RowOutOfBoundsException;
import exercise3_1.exceptions.SeatEmptyException;
import exercise3_1.exceptions.SeatOccupiedException;
import exercise3_1.exceptions.SeatOutOfBoundsException;

public class Main {

	public static void main(String[] args) throws SeatOutOfBoundsException, NamePersonWrongException, SeatEmptyException, SeatOccupiedException, RowOutOfBoundsException {
		Cinema cinema = new Cinema();
		
		cinema.start();
	}

}
