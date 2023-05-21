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
	        
	        if (factura > 100) {
	            double discount = factura * 0.1;
	            
	            // double discount = factura * 10 / 100; 
	            
	            factura -= discount;
	        } else {
	            double discount = factura * 0.05;
	            
	            // double discount = factura * 5 / 100; 
	            
	            factura -= discount;
	        }
	        
	        //factura -= discount; 
	        // scade valoarea discountului din variabila factura și actualizează valoarea facturii cu valoarea rezultantă. 
	        // Este echivalent cu factura = factura - discount;.
	        
	        
	        System.out.println("Valoarea facturii cu discount aplicat: " + factura);
	    }
	}
