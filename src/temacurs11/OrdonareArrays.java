package temacurs11;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Avem urmatoarele array-uri:
 * 
 *  String[] textArray ={"Alba", "Iasi", "Bacau", "Constanta"};
 *  Integer[] intArray ={100,500,300,400,200};
 *  Character[] charArray={'a', 'b', 'd', 'c'};
 * 
 * 
 * Vom face o singura metoda care ordoneaza in felul urmator:
 *  -> array-ul de tip string alfabetic
 *  -> array-ul de tip integer crescator
 *  -> array-ul de tip char tot alfabetic.
 *  
 *  folosim GENERICS
 */

public class OrdonareArrays {

	   public static <T extends Comparable<T>> void ordoneazaArray(T[] array) {
	        Arrays.sort(array);
	    }
	   
	   //Metoda ordoneazaArray() este o metodă generica care primește un array de tip T ca argument și ordonează acest array 
	   //  folosind metoda Arrays.sort().
	
	public static void main(String[] args) {
		
		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
	    Integer[] intArray = {100, 500, 300, 400, 200};
	    Character[] charArray = {'a', 'b', 'd', 'c'};

	    ordoneazaArray(textArray);
	    ordoneazaArray(intArray);
	    ordoneazaArray(charArray);

	    System.out.println("Array-ul de tip String ordonat: " + Arrays.toString(textArray));
	    System.out.println("Array-ul de tip Integer ordonat: " + Arrays.toString(intArray));
	    System.out.println("Array-ul de tip Character ordonat: " + Arrays.toString(charArray));

	}

}
