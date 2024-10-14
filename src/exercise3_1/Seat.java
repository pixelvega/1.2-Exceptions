package exercise3_1;

public class Seat {
	private int row;
	private int seat;
	private String buyer;
	
	// constructor
	public Seat(int row, int seat, String buyer) {
		this.row = row;
		this.seat = seat;
		this.buyer = buyer;
	}
	
	// getters and setters
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
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
	
	public boolean isEquals(int row, int seat) {
		// TODO equals: Verifica si dos butacas son iguales comparando fila y asiento.
		return false;
	}
	
	public String seatToString() {
		return "Fila: "+ row + ", Asiento: " + seat + ", Persona: " + buyer;
	}
	
	

}
