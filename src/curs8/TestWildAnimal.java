package curs8;

public class TestWildAnimal {

	public static void main(String[] args) {
	
		WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
		
		System.out.println("--------------------------");
		
		
		Deer bambi = new Deer();
		bambi.makeSound(); // metoda suprascrisa / override
		bambi.eatGrass();
		
		//WildAnimal bambi2 = new Deer();
	   // WebDriver browser = new ChromeDriver();
		
		System.out.println("--------------------------");
		Lion simba = new Lion();
		
		simba.makeSound(); //metoda suprascrisa
		simba.eatMeat();

		 
	/*
	
		WildAnimal simba = new Lion(); 
		simba.makeSound();
		((Lion) simba).eatMeat();
		
		simba = new Deer();
		simba.makeSound();
		
		 * 
	 */
	}	
		
}
