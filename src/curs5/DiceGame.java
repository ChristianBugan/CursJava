package curs5;

import java.util.Scanner;

public class DiceGame {

	/*
	 * Facem un joc de zaruri unde avem urmatoarele reguli:
	 * 1. daca userul arunca cu zarul: 2, 6, 12 --> Pierde jocul
	 * 2. daca userul arunca cu zarul: 7, 11 --> Castiga jocul
	 * 3. daca userul arunca cu zarul: 3, 10 --> repeta automat aruncarea
	 * 4. daca userul arunca oricare alta varianta decat cele de mai sus, 
	 *    il intrebam daca vrea sa repete aruncarea
	 *    Raspunsul afisat trebuie sa fie un boolean: true sau false
	 *    
	 */
	
	public static void main(String[] args) {
		
		boolean continuaJocul = true;
		System.out.println("Doresti sa mai dai o data ?");
		Scanner scan  = new Scanner(System.in);
		
		while(continuaJocul) {			
			int dice1 = (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);
			int total = dice1 + dice2;
			System.out.println("Ai dat :" + total);
			
			if(total == 2|| total == 6 ||total == 12) {
				System.out.println("Ai pierdut jocul!");
				continuaJocul = false;
				
			}else if(total == 7|| total == 11 ) {
				System.out.println("Ai castigat jocul!");
				break;

			}else if(total == 3|| total == 10) {
				System.out.println("Automat mai dai o data!");
			}
			
					
					continuaJocul =  scan.nextBoolean();
					
					
		
		 scan.close();
		 System.out.println("GAME OVER!");

	     
		
	}

}
