package curs11;

import java.util.Set;
import java.util.HashSet;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		Set<String> numeDuplicat = new HashSet<>();
		
		String[] names = {"Ion", "Oana", "Maria", "Ion",
				"Oana", "Ion", "Bogdan", "Ion", "Maria", "Oana"};
		
		for(int i=0; i<names.length; i++) {
			
			for(int j = names.length-1;  j>i; j--) {
				
				if(names[i].equals(names[j]) ) {
					System.out.println("Nume duplicat :" + names[i]);
					
					numeDuplicat.add(names[i]);
					
				}
			}
		}
		
		System.out.println("-----------------------------");
		for (String nume : numeDuplicat) {
			System.out.println("Nume duplicat :" + nume);
		}
	}


}
