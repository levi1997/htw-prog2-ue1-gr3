package u1;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Guest matt = new Guest("Matt");
		Guest anna = new Guest("Anna");
		
		Address address = new Address("Stephanstr.", "11a", "10559", "Berlin");
		
		matt.setPrivateAdresse(address);
		anna.setPrivateAdresse(address);
		
		System.out.println(matt);
		System.out.println(anna);
		

	}

}
