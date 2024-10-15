package exercise3_1;

public class Seat {
	private int row;
	private int seat;
	private String person;
	
	// constructor
	public Seat(int row, int seat, String person) {
		this.row = row;
		this.seat = seat;
		this.person = person;
	}
	
	// getters and setters
	public String getPerson() {
		return person;
	}
	public void setBuyer(String buyer) {
		this.person = buyer;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
	@Override
	public boolean equals(Object newSeat) {
		if(this == newSeat) {
			return true;
		}
		
		if(newSeat == null || getClass() != newSeat.getClass()) {
			return false;
		}
		
		Seat convertedSeat = (Seat) newSeat;
		return row == convertedSeat.getRow() && seat == convertedSeat.getSeat() && person.equals(convertedSeat.getPerson());
		
	}
	
	@Override
	public String toString() {
		return "Fila: "+ row + ", Asiento: " + seat + ", Persona: " + person;
	}
	
	

}
