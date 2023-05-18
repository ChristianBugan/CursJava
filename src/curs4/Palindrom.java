package curs4;

public class Palindrom {
	
	//radar

	public static void main(String[] args) {
		
		checkPalindrom("ana are mere");

	}
	
	
	public static void checkPalindrom(String cuvant) {
		
		/*
		 * cuvantIntors= "";
		 * cuvant = radar 
		 * radar
		 * 01234
		 * 
		 * cuvantIntors = cuvantIntors + "r"
		 * cuvantIntors = cuvantIntors + "a"
		 *  
		 */
		
		//cuvant.lenght = 5  iar cuvant.lenght()-1=4
		String cuvantIntors= "";
		
		for(int i = cuvant.length()-1; i>=0; i--) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			//prima iteratie 
			//i = 4 
			// cuvantIntors = "" (are valoarea nimic)
			// "" = "" + "r"
			//iteratia doi
			// i = 3
			// cuvantIntors = "r"
			// "r" = "r" + "a"
			//iteratia trei
			// i = 2
			// cuvantIntors= "ra"
			// "ra" = "ra" + "d"
		}
		
		System.out.println(cuvant);
		System.out.println(cuvantIntors);
		
		String result = cuvantIntors.equals(cuvant) ? "Este palindrom" : "Nu este palindrom";
		System.out.println(result);
 		
	}

}
