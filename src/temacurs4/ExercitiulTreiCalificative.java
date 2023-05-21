package temacurs4;

import java.util.Scanner;

/*
 * Scriem un program care intreaba utilizatorul un punctaj.
 * Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii atribuim FB
 * Daca ultilizatorul introduce o valoarea mai mare sau egala cu 80 ii atribuim B
 * Daca ultilizatorul introduce o valoarea mai mica decat 80 ii atribuim S
 * Daca a luat calificativ FB printam: "Ai primit: FoarteBine"
 * Daca a luat calificativ B printam: "Ai primit: Bine"
 * Daca a luat calificativ S printam: "Ai primit Suficient"
 */

public class ExercitiulTreiCalificative {
	
	public static void main(String[] args) {
		
		    System.out.println("Introdu punctajul: ");
	        Scanner scan = new Scanner(System.in);
	        int punctaj = scan.nextInt();
	        
	        String calificativ;

	        if (punctaj >= 90) {
	            calificativ = "FB";
	            System.out.println("Ai primit: Foarte Bine");
	        } else if (punctaj >= 80) {
	            calificativ = "B";
	            System.out.println("Ai primit: Bine");
	        } else {
	            calificativ = "S";
	            System.out.println("Ai primit: Suficient");
	        }
		
	}

}
