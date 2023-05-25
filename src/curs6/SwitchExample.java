package curs6;

import java.util.Scanner;

public class SwitchExample {

	/*
	 * Intrebam userul un calificativ
	 * In functie de calificativ printez:
	 * Daca introduce A : printez : "Felicitari!"
	 * Daca introduce B : printez : "Destul de bine!"
	 * Daca introduce C : printez : "Suficient!"
	 * Daca introduce D : printez : "Insuficient!"
	 * Daca introduce alt calificativ printez : "Calificativ invalid!"
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("Te rog introdu un calificativ");
		Scanner scan = new Scanner(System.in);
		String calificativ = scan.next();
		
		switch(calificativ.toUpperCase()) {
		
		case "A" :
			System.out.println("Felicitari");
			break;
			
		case "B" :
			System.out.println("Destul de bine!");
			break;
			
		case "C" :
			System.out.println("Suficient!");
			break;
			
		case "D" :
			System.out.println("Insuficient!");
			break;
			
		default :
			System.out.println("Calificativ invalid!");
		}
		
		
	}

}
