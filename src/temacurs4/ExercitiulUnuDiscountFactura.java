package temacurs4;

import java.util.Scanner;


/*
 * Scriem un program care aplica un discount unei facturi
 * Daca factura este mai mare decat 100, aplicam discount de 10 %
 * Daca factura este mai mica decat 100, aplicat discount de 5 %
 * Printam rezultatul
 */

public class ExercitiulUnuDiscountFactura {

	  public static void main(String[] args) {
	        
	 
	        double factura;

	        System.out.println("Introdu valoarea facturii: ");
	        Scanner scan = new Scanner(System.in);
	        factura = scan.nextDouble();

	        double discount = (factura > 100) ? (factura * 0.1) : (factura * 0.05);
	        factura -= discount;

	        System.out.println("Valoarea facturii cu discount aplicat: " + factura);
	    }
	    
	}
