package curs6;

import java.util.Scanner;

public class SwitchExample2 {

	/*
	 * 
	 * Facem un program care verifica daca un student este eligibil pentru bursa
	 * Conditiile sunt:
	 * -> sa fie anul 3 
	 * -> sa aiba un punctaj de 80 pentru bursa1
	 * -> sa aiba un punctaj de 50 pentru bursa2
	 * (sunt 2 tipuri de bursa) 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		int an;
		int punctaj;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Te rog introdu ce an esti: ");
		an = scan.nextInt();
		
		
		
		switch(an) {
		case 3:
			System.out.println("Te rog introdu punctajul: ");
			punctaj = scan.nextInt();
			switch(punctaj) {
			case 80:
				System.out.println("Esti eligil pentru bursa1");
				break;
			case 50:
				System.out.println("Esti eligil pentru bursa2");
				break;
			default:
				System.out.println("Nu esti eligil");
				
			}
		    break;
			default:
				System.out.println("Nu esti eligil");
		
		}
		
	}

}
