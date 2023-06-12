package curs9;

public class TestInterface {

	public static void main(String[] args) {
	
	//	Angajat angajat = new Angajat();

		Tester t1 = new Tester();
		t1.setEmail("Oana@oana.com");
		t1.setName("Oana");
		t1.printDepartament();
		
		Developer dev1 = new Developer();
		dev1.printDepartament();
		
		
	}

}
