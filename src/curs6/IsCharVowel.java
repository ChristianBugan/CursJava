package curs6;

import java.util.Scanner;

public class IsCharVowel {

	/*
	 * Verific daca o litera este consoana sau vocala
	 * Folosesc un switch ca si logica
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Te rog introdu o litera: ");
		Scanner scan = new Scanner(System.in);
		
		char litera = scan.next().charAt(0);
		
		//vocala: aeiouAEIOU
		
		switch(litera) {
		
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : System.out.println("Este vocala");
		break;
		default:
			System.out.println("Este consoana! ");
			
		}

	}

}
