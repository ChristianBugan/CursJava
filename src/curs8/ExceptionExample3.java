package curs8;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		try {
			String nume = null;
			System.out.println(nume.length());
			
		}catch(Exception e) {
			System.out.println("Exception occured!");
			System.out.println(3/0);
		
		}finally {
			//folosim finally sa printam indiferent de ce este in try catch
			
			System.out.println("Final block of code");
		}
		
		System.out.println("Seteaza parametrul inapoi!");

	}

}
