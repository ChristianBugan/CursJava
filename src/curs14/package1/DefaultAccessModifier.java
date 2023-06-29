package curs14.package1;

class DefaultAccessModifier {

	/*
	 * Default inseamna ca nu specificam niciun access modifier
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * Aceasi clasa: YES
	 * Sub-clasa acelasi pachet: YES
	 * Alta clasa in acelasi pachet: YES
	 * 
	 * Sub-clasa in alt pachet: NO
	 * Alta clasa in alt pachet: NO
	 * 
	 * 
	 */
	
	String mesaj = "Default modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		
		DefaultAccessModifier obj = new DefaultAccessModifier();
        obj.printMesaj();
        
	}

}
