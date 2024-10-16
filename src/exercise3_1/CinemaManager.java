package exercise3_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercise3_1.exceptions.NamePersonWrongException;
import exercise3_1.exceptions.RowOutOfBoundsException;
import exercise3_1.exceptions.SeatEmptyException;
import exercise3_1.exceptions.SeatOccupiedException;
import exercise3_1.exceptions.SeatOutOfBoundsException;

public class CinemaManager {
	private Cinema cinema;
	Scanner scanner = new Scanner(System.in);
	
	public CinemaManager(Cinema cinema) {
		this.cinema = cinema;
	}

	public void displayMenu() throws RowOutOfBoundsException, SeatOutOfBoundsException, NamePersonWrongException, SeatEmptyException, SeatOccupiedException {
		int selectedOption = -1;

		String[] options = {
				"Mostrar todas las butacas reservadas.",
				"Mostrar las butacas reservados por una persona.",
				"Reservar una butaca.", 
				"Anular la reserva de una butaca.", 
				"Anular todas las reservas de una persona.", 
				"Salir."
		};
		
		Scanner scanner = new Scanner(System.in);
		
		while(selectedOption != 0) {
			System.out.print("MENU: \n");
			for (int i = 0; i < options.length; i++  ) {
				System.out.println((i+1)+".Option " + options[i]);
			}
			System.out.println("Escoge la opción: ");
			try {
				selectedOption =  scanner.nextInt();
				if (selectedOption > 0 && selectedOption <= 5) {
					System.out.println("👉 La opción escogida es: " + selectedOption);
					
					switch (selectedOption) {
						case 1:
							displayAllReservedSeats();
							break;
						case 2:
							displaySeatsByPerson();
							break;
						case 3:
							bookSeat();
							break;
						case 4:
							cancelBooking();
							break;
						case 5:
							cancelAllBookingByPerson();
							break;
						case 6:
							selectedOption = 0;
							break;
						default:
							displayMenu();
							break;
					}
					
				} else {
					System.out.println("☠️ Error: La opción debe ser un número entre 1 y 6. \n");
					displayMenu();
				}
			} catch (InputMismatchException e) {
				System.out.println("☠️ Error: La opción debe ser un número entre 1 y 6. \n");
				scanner.nextLine();	
				displayMenu();
			}
			
		}

		scanner.close();
	}
	
	private void displayAllReservedSeats() {
		ArrayList<Seat> rows = cinema.getSeatManager().getSeats();
		System.out.println("👉 Butacas reservadas: " + rows);
		
	}
	
	private void displaySeatsByPerson() {
		String person = scanner.next();
		
		ArrayList<Seat> seats = cinema.getSeatManager().getSeats();
		List<Seat> filteredSeats = seats.stream().filter(seat -> seat.getPerson().equals(person)).collect(Collectors.toList());
		System.out.println("👉 Las butacas reservadas de " + person + ": ");
		System.out.println(filteredSeats + "\n");
	}
	
	private void bookSeat() throws InputMismatchException, RowOutOfBoundsException, SeatOutOfBoundsException, NamePersonWrongException, SeatOccupiedException {
		int row = introduceRow();
		int seat = introduceSeat();
		String person = introducePerson();
		Seat newSeat = new Seat(row, seat, person);
		cinema.getSeatManager().addSeat(newSeat);
	}
	
	private void cancelBooking() throws NamePersonWrongException, SeatEmptyException {
		int numRow;
		int numSeat;
		
		try {
			System.out.println("Introduce el número de fila:");
			numRow = scanner.nextInt();
			System.out.println("Introduce el número de butaca:");
			numSeat = scanner.nextInt();
			cinema.getSeatManager().deleteSeat(numRow, numSeat);
			
		} catch (InputMismatchException e){
			System.out.println(e.getMessage());
			scanner.nextLine();
		}
		
	}
	
	private void cancelAllBookingByPerson() throws NamePersonWrongException, SeatEmptyException {
		String person = introducePerson();
		Iterator<Seat> iterator = cinema.getSeatManager().getSeats().iterator();
		
		while (iterator.hasNext()) {
			Seat seat = iterator.next();
			if (Objects.equals(seat.getPerson(), person)) {
				iterator.remove();
	        }
		}
		
	}
	
	private String introducePerson() throws NamePersonWrongException {
		String name = "";
		boolean isValid = false;
		
		while(!isValid) {
			System.out.println("Introduce el nombre de la persona:");
			String value = scanner.next();
			if (value.trim().length()>1) {
				name = value;
				isValid = true;
			} else {
				System.out.println("☠️ El nombre no es correcto, debe tener al menos 2 caracteres. \n");
			}
		}
		
		return name;
	}
	
	private int introduceRow() throws RowOutOfBoundsException, InputMismatchException {
		int numRow = -1;
		int maxRow = cinema.getRows();
		boolean isValid = false;
		
		while (!isValid) {			
			try {
				System.out.println("Introduce el número de fila: ");
				numRow = scanner.nextInt();
				if(numRow > 0 & numRow <= maxRow) {				
					System.out.println("👉 La fila escogida es la " + numRow);
					isValid = true;
				} else {
					scanner.nextLine();	
					System.out.println("☠️ Error al escoger la fila. Debe estar comprendida entre 1 y " + maxRow + "\n");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("☠️ Error. Debes introducir un número. \n");
			}
		}
		return numRow;
		
	}
	
	private int introduceSeat() throws SeatOutOfBoundsException, InputMismatchException {
		int numSeat = -1;
		boolean isValid = false;
		
		while(!isValid) {
			try {
				System.out.println("Introduce el número de butaca: ");
				numSeat = scanner.nextInt();
				if(numSeat > 0 & numSeat <= cinema.getSeatsPerRow()) {
					System.out.println("👉 La butaca escogida es la " + numSeat);
					isValid = true;
				} else {
					scanner.nextLine();	
					System.out.println("☠️ Error al escoger la butaca. \n");
				}
			} catch (InputMismatchException e) {
				System.out.println("☠️ Error. Debes introducir un número. \n");
			}
		}
		
		return numSeat;
	}
	
}
