package u1;

public class Hotel {
	
	private Guest [] guests = new Guest[1000];
	
	public boolean addGuest (Guest guest) {
		int numberOfGuests = findNumberofGuest();
		guests[numberOfGuests] = guest;
		return true;
	}
	
	private int findNumberofGuest() {
		return 0;
	}
}
