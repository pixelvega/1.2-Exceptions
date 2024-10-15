package exercise3_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cinema {
	private int rows; // Número de filas del cine.
	private int seatsPerRow; // Número de asientos por cada fila.
	SeatManager seatManager;
	CinemaManager cinemaManager;
	
	public Cinema() {
		this.seatManager = new SeatManager();
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
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean isCinemaConfigured = false;
		
		while (!isCinemaConfigured) {
			try {
				System.out.print("¿Cuántas filas tiene el cine?");
				setRows(scanner.nextInt());
				System.out.print("¿Cuántas butacas por fila tiene?");
				setSeatsPerRow(scanner.nextInt());
				isCinemaConfigured = true;
				
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
		} 
	}
	
	// Method to init the cinema manager
	public void start() {
		// TODO L’aplicació un cop s’hagi iniciat, 
		// preguntarà a l’usuari/ària quantes files 
		// i quants seients per fila té la sala de cinema.
		
		configureCinema();
		cinemaManager.displayMenu();
	}
	
}
