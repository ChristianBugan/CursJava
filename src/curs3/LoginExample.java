package curs3;

import java.util.Scanner;

/*
 * facem un program care citeste de la tastatura un user si o parola 
 * si le verifica daca sunt la fel ca urmatoarele:
 * String "TestUser"
 * int 1234 
 * Daca nu sunt la fel printeaza: "login successfull"
 * Daca nu sunt la fel printeaza: "username or password is incorrect"
 */

public class LoginExample {
	
	public String username;
	public int password;
	
	public  void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please unter the username: ");
		username = scan.next();
		System.out.println("Please enter the password: ");
		password = scan.nextInt();
		scan.close();
		
	}
	
	//pentru string fosim intotdeauna equals pentru comparare
	// && --> and operator
	// || --> acesta este or operator
	
	
	public void checkCredentials() {
		
		if(username.equals("TestUser") && password == 1234) {
			
			System.out.println("Login Successfull");
		}else {
			System.out.println("Username or Password is incorrect");
			
		} 
		
	}

}
