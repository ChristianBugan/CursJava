package temacurs4;

import java.util.Scanner;

public class SumaZeceNumere {

	
	/*
	 * Scriem un program care intreaba utilizatorul 10 numere sub urmatoarea forma:
	 * Te rog introdu numarul 1: 
	 * Te rog introdu numarul 2:
	 * ---etc
	 * 
	 * Dupa ce utilizatorul a introdus cele zece numere calculam suma lor si o printam sub urmatoarea forma:
	 * 
	 * Suma numerelor este: 
	 * 
	 * Observatii:
	 * - O sa folosim instructiunea FOR
	 * - Ce introduce userul il citim in FOR
	 * - Calculul sumei poate fi facuta cu un operator +=
	 */
	
	
	public static void main(String[] args) {
	
		    int suma = 0;
	        Scanner scan = new Scanner(System.in);

	        for (int i = 1; i <= 10; i++) {
	        
	        	//am folosit bucla for pentru a itera cele 10 numere pe care user-ul le introduce de la tastatura
	        	// am citit fiecare numar in interiorul buclei folosind scan.next(int)
	        
	            System.out.print("Te rog introdu numarul " + i + ": ");
	            int numar = scan.nextInt();
	            suma += numar;
	            
	            //Am calculat suma prin adaugarea fiecarui numar introdus la variabila suma folosind operatorul +=.
	        }

	        System.out.println("Suma numerelor este: " + suma);
		

	}

}
