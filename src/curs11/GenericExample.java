package curs11;

public class GenericExample {

	public static void main(String[] args) {
		
		printDetails("masina");
		printDetails(100);
		printDetails('c');
		printDetails(true);

	}

public static <T> void printDetails(T obj) {
		
		System.out.println("Obiect: " + obj);
		System.out.println("Data type: " + obj.getClass().getName());
	}
	
	
/*
 * 
 
	public static void printDetails(String text) {
		
		System.out.println("Obiect: " + text);
		System.out.println("Data type: " + text.getClass().getName());
	}
	
	public static void printDetails(Integer number) {
		
		System.out.println("Obiect: " + number);
		System.out.println("Data type: " + number.getClass().getName());
		
	}
	 
	 */
}
