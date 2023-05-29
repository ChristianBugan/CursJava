package curs7;

import java.util.Random;

public class RandomNumbers {

	/*
	 * Facem un program care genereaza 6 numere random intre 0 si 9
	 * 
	 * numerele le tinem intr-un array
	 * nu tinem numere duplicate
	 * 
	 * la final printam array-ul
	 * 
	 * 
	 * Facem o metoda care genereaza numerele si le pune in array(are return type array)
	 * Facem o metoda care nu permite duplicat
	 * Facem o metoda care printeaza array-ul
	 * 
	 */
	
	public final int LENGTH = 6;
	public final int MAX_NUMBERS = 9;
	
	public static void main(String[] args) {
		
		// Random random = new Random();
		// random.nextInt(9);

		RandomNumbers obj = new RandomNumbers();
		
		obj.afisareArray(obj.generateNumbers());
		
		
	}
	
	public int[] generateNumbers() {
		
		Random random = new Random();
		int[] numbers = new int[LENGTH];
		
		int index = 0;
		while(index < LENGTH) {
			numbers[index] =random.nextInt(9);
			//verific array-ul la fiecare nr generat daca a fost adaugat sau nu.
			// daca a fost adaugat nu il mai adaug
			// daca nu a fost adaugat il adaugat
			
			int randomNr = 0;
			
			while(checkDuplicate(randomNr, numbers))
			{
				randomNr = random.nextInt(9);
			}			
			
			
			numbers[index] = randomNr;
	
			index++;
		}
		
		return numbers;
	}

	public void afisareArray(int[] array) {
		
		for(int nr : array) {
			System.out.print(nr + " | ");
		}
		
	}
	
	public boolean checkDuplicate(int element, int[] array) {
		
		for(int nr : array) {
			if(element == nr) {
				return true;
			}
		}
		return false;
	}
	
	
}
