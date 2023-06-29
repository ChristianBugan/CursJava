package curs14.package1;

public class ProtectedAccessModifier {

	/*
	 * Protected 
	 *    Scopul lui este in acelasi pachet si sub-clase din pachete diferite.
	 *	  Clasele nu pot fi declarate ca protected.
	 *
	 * Aceasi clasa : YES
	 * Alta clasa in acelasi pachet : YES
	 * Sub-clasa in acelasi pachet : YES
	 * 
	 * Sub-clasa in alt pachet : YES
	 * Alta clasa in alt pachet : NO
	 * 
	 * 
	 */

	
	protected String mesaj = "Protected Access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
	
	}

}
