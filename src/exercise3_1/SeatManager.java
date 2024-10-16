package exercise3_1;

import java.util.ArrayList;

import exercise3_1.exceptions.SeatEmptyException;
import exercise3_1.exceptions.SeatOccupiedException;

public class SeatManager {
	private ArrayList<Seat> seats ;
	
	public SeatManager() {
		this.seats = new ArrayList<Seat>();
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}
	
	public void addSeat(Seat seatToAdd) throws SeatOccupiedException {
		boolean isSeatAbailable = searchSeat(seatToAdd.getRow(), seatToAdd.getSeat()) < 0;
		
		if(isSeatAbailable) {
			seats.add(seatToAdd);
		} else {
			System.out.println("☠️ Error. Esta butaca no puede reservarse porque no ya está reservada. \n");

		};
		
		
	}
	
	public void deleteSeat(int rowToDelete, int seatToDelete) throws SeatEmptyException {
		int indexOfSeat = searchSeat(rowToDelete, seatToDelete);
		
		if(indexOfSeat>=0) {
			seats.remove(indexOfSeat);
			
		} else {
			System.out.println("☠️ Error. Esta butaca no puede eliminarse porque no está reservada. \n");
			
		}
	}
	
	public int searchSeat(int rowToFind, int seatToFind) {
		System.out.println("** search Seat");
		for(int i=0; i < seats.size(); i++) {
			Seat item = seats.get(i);
			if(item.getRow() == rowToFind & item.getSeat() == seatToFind) {
				return i;
			}
		}
		return -1;
	}

}
