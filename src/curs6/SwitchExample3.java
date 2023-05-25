package curs6;

import java.util.Scanner;

public class SwitchExample3 {

	/*
	 * Facem un program care cere de la tastatura un an si o luna
	 * printeaza cate zile are luna respectiva
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un an: ");
		int an = scan.nextInt();
		System.out.println("Te rog sa introduci o luna: ");
		int luna = scan.nextInt();
		
		int zile = 0;
		
		switch(luna) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: zile = 31;
		break;
		
		case 4:
		case 6:
		case 9:
		case 11: zile = 30;
		break;
		
		case 2: 
			//an%400 ==0 sau an%4 == 0 si an%100 !=0
			
			if( (an % 4 ==0 && (an % 100 !=0 ) || an % 400 == 0)) {
				zile = 29;
			}else {
				zile = 28;
			}
		
			break;
		default: 
			System.out.println("Introdu o valoare valida!");
			
		}
		
		System.out.println("Luna aleasa de tine are" + zile);
		
	
	}

}
