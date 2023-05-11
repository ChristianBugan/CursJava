package curs2;

// numele claselor le scriem cu UpperCamelCase (gen NumeleClaseiMele)
// NUMELE metodelor -> lowerCamelCase - numeleMetodei mele

public class Tester {

	//variabile de instanta
	private String nume;
	public int ratePerHour;
	
	//constructor default
	public Tester() {}
	
	public Tester (String nume, int ratePerHour) {
		setNume(nume);
		this.ratePerHour = ratePerHour;
	}
	
	
	
	//metode
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	
	
}
