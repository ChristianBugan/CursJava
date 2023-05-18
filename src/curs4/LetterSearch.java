package curs4;

import java.util.Scanner;

/*
 * Facem un program care citeste un text de la tastatura
 * in text cautam litera a, A
 * Daca o gasim, printam ca am gasit  litera si de cate ori
 * Daca nu o gasim, printam ca litera a nu exista in text
 * 
 */


public class LetterSearch {

	public static void main(String[] args) {
	
		System.out.println("Please enter a text");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		
		
		//masina
		//012345  in java numaram de la 0
		// text.charAt(i)
		
		System.out.println(text.length());
		int y=0;
		
		for (int i =0; i<text.length();i++) {
			
			if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				y++;
			}
			
		}
		
		String result = y ==0 ? "Nu exista in text ": "Am gasit litera a de " + y + "ori!";
		System.out.println(result);
		

	}

}
