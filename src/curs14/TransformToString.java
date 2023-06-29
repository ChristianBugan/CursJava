package curs14;

public class TransformToString {

	public static void main(String[] args) {

		char ch = 'a';
		String chString = Character.toString(ch);
		String chString2 = String.valueOf(ch);
		
		int nr = 20;
		String intString = Integer.toString(nr);
		String intString2 = String.valueOf(nr);
		
		boolean bol = true;
		String bolString = Boolean.toString(bol);
		String bolString2 = String.valueOf(bol);
		
		String str = null;
		//System.out.println(str.toString()); //daca obiectul este null aceasta linie arunca null pointer exception
		System.out.println(bolString.valueOf(str)); // daca obiectul este null , acest sysout printeaza null;
		
		
	}

	
	
	
}
