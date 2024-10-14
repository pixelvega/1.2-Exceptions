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
	
	// Method to init the cinema manager
	public void start() {
		cinemaManager.displayMenu();
	}
	
}
