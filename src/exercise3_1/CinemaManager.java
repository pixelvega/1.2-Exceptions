package exercise3_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CinemaManager {
	private Cinema cinema;
	
	public CinemaManager(Cinema cinema) {
		this.cinema = cinema;
	}

	public void displayMenu() {
		// TODO Mostrarà les opcions del menú principal a l’usuari/ària, 
		// li demanarà el número de l’opció escollida i el retornarà.
		String[] options = {
				"Mostrar butacas",
				"Mostrar butacas por persona",
				"Reservar butaca", 
				"Anular reserva", 
				"Anular reserva por persona", 
				"Introducir persona",
				"Introducir fila",
				"Introducir asiento"
		};
		System.out.print("MENU: \n");
		for (int i = 0; i < options.length; i++  ) {
			System.out.println((i+1)+".Option " + options[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escoge la opción: ");
		try {
			int selectedOption =  scanner.nextInt();
			if (selectedOption > 0 && selectedOption < 5) {
				System.out.println("La opción escogida es: " + selectedOption);
			} else {
				System.out.println("Error: La opción debe ser un número entre 1 y 5");
				displayMenu();
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: La opción debe ser un número entre 1 y 5");
			displayMenu();
		} finally{
			scanner.close();
		}
	}
	
	private void displaySeats() {
		// TODO Mostra totes les butaques reservades.
	}
	
	private void displaySeatsByBuyer() {
		// TODO Demana el nom de la persona que ha fet la reserva i mostra totes les butaques reservades per aquesta persona
	}
	
	private void bookSeat() {
		// TODO Demana a l’usuari/ària un número de fila (crida al mètode "introduirFila"), 
		// un número de seient (crida al mètode "introduirSeient"), 
		// el nom de la persona que fa la reserva (crida al mètode "introduirPersona") i 
		// reserva la butaca.
	}
	
	private void cancelBooking() {
		// TODO "anularReserva": 
		// Demana a l’usuari/ària un número de fila (crida al mètode "introduirFila"), 
		// un número de seient (crida al mètode "introduirSeient")
		// elimina la reserva de la butaca.
	}
	
	private void cancelAllBookingsByBuyer() {
		// TODO "anularReservaPersona": 
		// Demana a l’usuari/ària el nom de la persona (crida al mètode "introduirPersona") 
		// i elimina les butaques reservades per la persona introduïda.
	}
	
	private void introduceBuyer() {
		// TODO "introduirPersona": Demana a l’usuari/ària el nom de la persona i el retorna si és correcte. 
		// Si conté números, llença una excepció personalitzada "ExcepcioNomPersonaIncorrecte"
	}
	
	private void introduceRow() {
		// TODO "introduirFila": Demana el nombre de fila, 
		// si aquest està entre 1 i el nombre de files totals, el retorna. 
		// Si no, llença una excepció personalitzada "ExcepcioFilaIncorrecta"
	}
	
	private void introduceSeat() {
		// TODO "introduirSeient": Demana el seient, 
		// si el número està entre 1 i el nombre total de seients, el retorna. 
		// Si no, llença una excepció personalitzada "ExcepcioSeientIncorrecte"
	}
	
	
}
