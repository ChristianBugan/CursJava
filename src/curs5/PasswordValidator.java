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
	String password;
	Scanner scan = new Scanner();
	
	public void getUsername() {
		System.out.println("Te rog introdu username: ");
		username = scan.next();
	}
	
	public void getPassword() {
		System.out.println("Te rog introdu parola: ");
		password = scan.next();
	}
	
	public void printPasswordRules() {
		System.out.println("Reguli parola");
		System.out.println("1. parola trebuie sa aiba minim 10 caractere");
		System.out.println("2. Parola trebuie sa contina un upper case");
		System.out.println("3. Parola nu trebuie sa fie aceeasi cu username");
	}
	
	public boolean checkPasswordRules() {
		
		if(password.length() < 10) {
			System.out.println("parola trebuie sa aiba minim 10 caractere");
			return false;
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
