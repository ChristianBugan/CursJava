package curs2;

public class WageCalculator {

//Java executa doar ce se afla in public static void main
	
	public int workedHours = 40;
	
	public static void main(String[] args) {
		
	 /* System.out.println("Print de test");
		WageCalculator obj = new WageCalculator();
		obj.printGreetings(); */
		
		Tester tester1 = new Tester();
		//tester1.nume = "Oana";
		tester1.ratePerHour = 25;
		tester1.setNume("Oana");
		
		
		Tester tester2 = new Tester();
		tester2.ratePerHour = 30;
		tester2.setNume("Maria");
		
		Tester tester3 = new Tester("Ion", 15);
		
		System.out.println("Rate per hour " + tester1.getNume() + " is " + tester1.ratePerHour);
		System.out.println("Rate per hour " + tester2.getNume() + " is " + tester2.ratePerHour);
		System.out.println("Rate per hour " + tester3.getNume() + " is " + tester3.ratePerHour);
		
		WageCalculator obj = new WageCalculator();
		System.out.println("Salariu lui " + tester1.getNume() + " este " + obj.calculateSalary(tester1.ratePerHour));
	}
	
	public int calculateSalary(int plataPeOra) {
		return workedHours * plataPeOra;
	}

	public void printGreetings() {
		System.out.println("Buna dimineata"); //sysout -pt eclipse si sout pt intelij
	}
	
}
