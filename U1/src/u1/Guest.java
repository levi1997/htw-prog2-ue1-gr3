package u1;

class Guest {   // nicht unbedingt public sein
	private String name;
	private Address privateAdresse;
	private Address businessAdresse;
	
	
	public Guest(String name) {
		this.name = name;
	}
	
	public void setPrivateAdresse( Address address) {
		this.privateAdresse = address;
	}
	
	public void setBusinessAdresse(Address address) {
		this.businessAdresse = address;
	}

	public String toString() {
		return "Guest [name=" + name + ", privateAdresse=" + privateAdresse + ", businessAdresse=" + businessAdresse
				+ "]";
	}
	
	

}
