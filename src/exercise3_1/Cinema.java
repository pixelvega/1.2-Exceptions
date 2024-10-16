package exercise3_1;

import java.util.InputMismatchException;
import java.util.Scanner;

import exercise3_1.exceptions.NamePersonWrongException;
import exercise3_1.exceptions.RowOutOfBoundsException;
import exercise3_1.exceptions.SeatEmptyException;
import exercise3_1.exceptions.SeatOccupiedException;
import exercise3_1.exceptions.SeatOutOfBoundsException;

public class Cinema {
	private static Scanner scanner = new Scanner(System.in);
	private int rows; 
	private int seatsPerRow;
	private SeatManager seatManager;
	private CinemaManager cinemaManager;
	
	public Cinema() {
		this.setSeatManager(new SeatManager());
		this.cinemaManager = new CinemaManager(this);
		
	}

	// getters and setters
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getSeatsPerRow() {
		return seatsPerRow;
	}

	public void setSeatsPerRow(int seatsPerRow) {
		this.seatsPerRow = seatsPerRow;
	}
	
	public void configureCinema() {
		
		boolean isCinemaConfigured = false;
		
		int configuredRows;
		
		while (!isCinemaConfigured) {

			try {
				System.out.print("¿Cuántas filas tiene el cine?");
				configuredRows = scanner.nextInt();
				setRows(configuredRows);				
				System.out.print("¿Cuántas butacas por fila tiene?");
				setSeatsPerRow(scanner.nextInt());
				isCinemaConfigured = true;
				
			} catch (InputMismatchException e) {
				System.out.println("☠️ Error, debes introducir un número. \n");
				scanner.nextLine();
			}
			
		} ;
		
	}
	
	public SeatManager getSeatManager() {
		return seatManager;
	}

	public void setSeatManager(SeatManager seatManager) {
		this.seatManager = seatManager;
	}
	
	// Method to init the cinema manager
	public void start() throws RowOutOfBoundsException, SeatOutOfBoundsException, NamePersonWrongException, SeatEmptyException, SeatOccupiedException {
		configureCinema();
		cinemaManager.displayMenu();
	}
	
}
