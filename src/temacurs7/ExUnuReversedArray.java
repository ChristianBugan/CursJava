package temacurs7;

import java.util.Scanner;

public class ExUnuReversedArray {
	
	/*
	 * Scriem un program care inverseaza un Array
	 * Avem o metoda care intreaba user-ul lungimea array-ului.
	 *    Exemplu: "Cate elemente trebuie sa aiba array-ul: "  // integer 
	 * 
	 * Avem o metoda care foloseste "for" pentru a inversa array-ul
	 *    si alta metoda cu "while" care face acelasi lucru - inverseaza array-ul
	 * 
	 * Print-ul din consola trebuie sa arate ceva de genul: 
	 * 
	 * Cate elemente trebuie sa aiba array-ul: 
	 * 4
	 * Introdu elementul 1: 3
	 * Introdu elementul 2: 4
	 * Introdu elementul 3: 7 
	 * Introdu elementul 4: 9 
	 * 
	 * Array-ul inversat este: 9 7 4 3 
	 */

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
	       
		    System.out.println("Cate elemente trebuie sa aiba array-ul:");
	        int length = scanner.nextInt();

	        int[] array = new int[length];
	        for (int i = 0; i < length; i++) {
	            System.out.println("Introdu elementul " + (i + 1) + ":");
	            array[i] = scanner.nextInt();
	        }

	        int[] reversedArrayFor = reverseArrayUsingFor(array);
	        int[] reversedArrayWhile = reverseArrayUsingWhile(array);

	        System.out.println("Array-ul inversat utilizand bucla 'for':");
	        printArray(reversedArrayFor);

	        System.out.println("Array-ul inversat utilizand bucla 'while':");
	        printArray(reversedArrayWhile);

	        scanner.close();
	    }

	    public static int[] reverseArrayUsingFor(int[] array) {
	        int[] reversedArray = new int[array.length];
	        int index = 0;
	        for (int i = array.length - 1; i >= 0; i--) {
	            reversedArray[index] = array[i];
	            index++;
	        }
	        return reversedArray;
	    }

	    public static int[] reverseArrayUsingWhile(int[] array) {
	        int[] reversedArray = new int[array.length];
	        int index = 0;
	        int i = array.length - 1;
	        while (i >= 0) {
	            reversedArray[index] = array[i];
	            index++;
	            i--;
	        }
	        return reversedArray;
	    }

	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	}

}
