package temacurs6;

import java.util.Scanner;

public class ExUnuBonus {
	/*
	 *  Scriem un program care simuleaza un program de acordat bonusuri
	 *  Programul primeste input de la utilizator:
	 *  -> Anul de vechimie in firma:
	 *  -> Valoarea vanzarilor efectuate
	 *  -> Luna in care a efectuat vanzarile	
	 *  
	 *  Daca are un an vechime atunci primeste un bonus de 100 
	 *  daca are 2 ani vechime primeste un bonus de 200 
	 *  
	 *  daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala (<=) 5000 
	 *  atunci primeste bonus 600 
	 *
	 *  Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala (<=) 10000 
	 *  si vanzarile au fost efectuate in oricare din lunile 1-6 , primeste bonus 800
	 *  
	 *  Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si vanzarile au fost
	 *  efectuate in oricare din lunile 7-11 primeste bonus 1000
	 *  
	 *  daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu 10000 si vanzarile 
	 *  au fost efectuate in luna 12 primeste bonus 900 si mesajul:"in decembrie se vand singure!"
	 *  
	 *  daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste bonus 1200
	 *  
	 *  folosim switch case
	 */

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

	    System.out.println("Te rog introdu anii de vechime in firma: ");
	    int vechime = scan.nextInt();

	    System.out.println("Te rog spune-mi valoarea vanzarilor efectuate: ");
	    double vanzari = scan.nextDouble();

	    System.out.println("Te rog introdu luna in care s-au efectuat vanzarile: ");
	    int luna = scan.nextInt();

	    double bonus = 0;

	    switch (vechime) {
	       case 1:
	          bonus = 100;
	          break;
	       case 2:
	          bonus = 200;
	          break;
	       case 3:
	          if (vanzari <= 5000) {
	             bonus = 600;
	          } else if (vanzari <= 10000) {
	              if (luna >= 1 && luna <= 6) {
	              bonus = 800;
	          } else if (luna >= 7 && luna <= 11) {
	              bonus = 1000;
	          } else if (luna == 12) {
	              bonus = 900;
	          
	              System.out.println("In decembrie se vand singure!");
	          }
	             } else {
	                    bonus = 1200;
	                }
	             break;
	             default:
	             break;
	        }

	        if (bonus > 0) {
	            System.out.println("Bonusul acordat este: " + bonus);
	        } else {
	            System.out.println("Nu s-a acordat niciun bonus.");
	        }

	        scan.close();
	    
	    }

	

}
