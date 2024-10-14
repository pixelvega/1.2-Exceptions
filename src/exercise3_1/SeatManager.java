package exercise3_1;

import java.util.ArrayList;

public class SeatManager {
	private ArrayList<Seat> seats ;
	
	public SeatManager() {
		this.seats = new ArrayList<Seat>();
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}
	
	public void addSeat(Seat seat) {
		// TODO 
		// Si la fila i el seient de la butaca rebuda com a paràmetre 
		// coincideixen amb el d’una butaca que ja es trobi a l’ArrayList (s’utilitzarà el mètode "cercarButaca"), 
		// es llençarà l’excepció personalitzada "ExcepcioButacaOcupada".
		
	}
	
	public void deleteSeat(int row, int seat) {
		// TODO
		// Rebrà com a paràmetres el número de fila i el seient 
		// i l’eliminarà de l’ArrayList. 
		// Si la fila i el seient no coincideixen amb el d’una butaca reservada (s’utilitzarà el mètode "cercarButaca"), 
		// llençarà una excepció personalitzada "ExcepcioButacaLliure".
	}
	
	public void searchSeat() {
		// TODO
		// Cerca a l’ArrayList de butaques, la butaca que  
		// coincideixi amb les dades rebudes com a paràmetre (fila i seient). 
		// Si la troba, retornarà la posició de la butaca a l’ArrayList 
		// i, si no la troba, retornarà -1.
	}

}
