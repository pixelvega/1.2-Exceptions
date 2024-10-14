package exercise3_1;

public class Cinema {
	private int rows;
	private int seatsPerRow;
	SeatManager seatManager;
	CinemaManager cinemaManager;
	
	public Cinema() {
		this.seatManager = new SeatManager();
		this.cinemaManager = new CinemaManager(this);
		
	}
	
}
