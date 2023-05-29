package curs7;

public class FindIndexOfElement {

	/*
	 * Plecam de la un array de tip INT
	 * ne trebuie o metoda pentru a gasii care este indexul unui element.
	 * 
	 * EXEMPLU: {2, 6, 4, 8, 9, 12}
	 * EXEMPLU: index pentru element 8 este 3
	 * 
	 * facem rezolvare cu:
	 * FOR 
	 * FOR EACH
	 * WHILE 
	 * DO WHILE
	 * 
	 */
	
	
	static int[] numbers = {3, 5, 7, 8, 9, 2, 12, 1};
	
	public static void main(String[] args) {
		rezolvareCuFor(8);
		rezolvareCuForEach(8);
		rezolvareCuWhile(8);
		rezolvareCuDoWhile(8);
	}
	
	public static void rezolvareCuFor(int element) {
		
		for(int i = 0; i< numbers.length; i++) {
			if(numbers[i] == 8) {
				System.out.println("Index pentru element " + element + " este " + i);
			}
		}
		
	}
	
	
	/*
	 * Iterator<Integer> index = numbers.interator();
	 * while(numbers.hasNext()){
	 * .....
	 * }
	 */
	
	public static void rezolvareCuForEach(int element) {
		
		int i = 0;
		for(int nr : numbers) {
			if(nr == element) {
				System.out.println("Index pentru element " + element + " este " + i);
				break;
			}
			i++;
		}
		
	}
	
	public static void rezolvareCuWhile(int element) {
		int i = 0;
		while(i <numbers.length) {
			 if(numbers[i] == element) {
				System.out.println("Index pentru element " + element + " este " + i);
			}
			 i++;
		}
		
	}
	
	public static void rezolvareCuDoWhile(int element) {
		
		int i = 0;
		do {
			if(numbers[i] == element) {
				System.out.println("Index pentru element " + element + " este " + i);
			}
			i++;
		} while(i <numbers.length);
		
		
	}

}
