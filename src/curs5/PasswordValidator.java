package curs5;

import java.util.Scanner;

public class PasswordValidator {

	/*
	 * Facem un program care valideaza o parola pe baza unor reguli:
	 * 
	 * Reguli:
	 *  1.) parola trebuie sa fie minim 10 caractere
	 *  2.) parola trebuie sa contina un upper case
	 *  3.) parola nu trebuie sa fie la fel ca username
	 *  
	 *  
	 *  Intrebam userul: un username si o parola
	 *  Il informam despre regulile parolei
	 *  
	 *  Daca parola este valida, atunci printam: "Parola valida!"
	 *  Daca parola este invalida, il informam care reguli nu au fost respectate.
	 *  Il tinem pe user in bucla pana introduce o parola valida
	 *  
	 *  
	 */
	
	
	String username;
	//String password;
	static boolean valid;
	Scanner scan = new Scanner(System.in);
	
	public void getUsername() {
		System.out.println("Te rog introdu username: ");
		username = scan.next();
	}
	
	public String getPassword() {
		System.out.println("Te rog introdu parola: ");
		return scan.next();
	}
	
	public void printPasswordRules() {
		System.out.println("Reguli parola");
		System.out.println("1. parola trebuie sa aiba minim 10 caractere");
		System.out.println("2. Parola trebuie sa contina un upper case");
		System.out.println("3. Parola nu trebuie sa fie aceeasi cu username");
	}
	
	public void checkPasswordRules(String password) {
		
		valid = true;
		
		if(password.length() < 10) {
			System.out.println("parola trebuie sa aiba minim 10 caractere");
			valid = false;
		}
		
		/*password = "Admin"
		 * Password.equals(password.toLowerCase())
		 * 
		 * 
		 */
		
		
		if(password.equals(password.toLowerCase())) {
			System.out.println("Parola trebuia sa contina un upper case");
			valid = false;
				
		}
		
		if(password.equals(username)) {
			System.out.println("Parola nu trebuie sa fie aceeasi cu username");
			valid = false;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		PasswordValidator obj = new PasswordValidator();
		obj.printPasswordRules();
		obj.getUsername();
		
		do {
			obj.checkPasswordRules(obj.getPassword());
			
		}while(!valid);
		
		System.out.println("Parola este valida!Yeeey");
		
	}

}
