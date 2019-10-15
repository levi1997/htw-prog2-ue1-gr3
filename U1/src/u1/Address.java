package u1;

public class Address {
	
	// TEIL 1/3
	private String strasse;
	private String hausnummer;
	private String plz;
	private String stadt;
	
	// TEIL 2/3
	public Address(String strasse, String hausnummer, String plz, String stadt) {
		super();
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.stadt = stadt;
	}
	
	
	// TEIL 3/3

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}


	public String toString() {
		return "Address [strasse=" + strasse + ", hausnummer=" + hausnummer + ", plz=" + plz + ", stadt=" + stadt + "]";
	}
	
	
	
	
	
	

}
