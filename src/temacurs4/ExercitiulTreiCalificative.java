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
		
		 //   System.out.println("Introdu punctajul: ");
	       // Scanner scan = new Scanner(System.in);
	       // int punctaj = scan.nextInt();
	        
	       // String calificativ;

	       // if (punctaj >= 90) {
	          //  calificativ = "FB";
	          //  System.out.println("Ai primit: Foarte Bine");
	       // } else if (punctaj >= 80) {
	           // calificativ = "B";
	          //  System.out.println("Ai primit: Bine");
	      //  } else {
	          //  calificativ = "S";
	        //    System.out.println("Ai primit: Suficient");
	       // }
		
		    System.out.println("Introdu punctajul: ");
	        
		    Scanner scan = new Scanner(System.in);
	        
	        int punctaj = scan.nextInt();

	        String calificativ = (punctaj >= 90) ? "FB" : (punctaj >= 80) ? "B" : "S";
	       
	        //daca punctaj >= 90 atunci expresia este evaluata cu FB si o atribuim lui calificativ
	        //daca punctaj >= 90 este fals atunci trecem la punctaj >=80. Daca e adevarata i-o atribuim lui calificativ
	        // daca niciuna nu este adevarata ii atribui S
	        
	        String mesaj = (calificativ.equals("FB")) ? "Foarte Bine" : (calificativ.equals("B")) ? "Bine" : "Suficient";

	        System.out.println("Ai primit: " + mesaj);
		
		
	}

}
