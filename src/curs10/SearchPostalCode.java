package curs10;

import java.util.Scanner;

public class SearchPostalCode {

	public static void main(String[] args) throws CodPostalException {
		
		Scanner scan  = new Scanner(System.in);
		CoduriPostale codPostal = new CoduriPostale();
		
		do {
			System.out.println("Introdu un cod postal: ");
			int cod =  scan.nextInt();
		try {
			if(codPostal.cp.containsKey(cod)) {
				System.out.println(codPostal.cp.get(cod));
				break;
			}else {
				throw new CodPostalException("Codul postal nu exista!");
			}
		
		}catch(CodPostalException e) {}			
		}while(true);	
		
		scan.close();
	}
}