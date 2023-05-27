package temacurs5;

import java.util.Scanner;

public class ExUnu {

	// Scriem un program care simuleaza un login.
    // Programul primeste input de la utilizator un user si o parola.
	// Are trei incercari de logare
	// Atata timp cat incearca de trei ori si credentialele sunt gresite programul va printa : “Maximum attempts reached. User blocked”
	// Pentru fiecare incercare gresita programul printeaza : “Login Error”
	// Daca credentialele sunt valide programmul printeaza : “Login Sucessful”
	// Observatii
	// Userul este String si valoarea valida este: “TestUser”
	// Parola este int si valoarea valida este :1234
	
	public static void main(String[] args) {
		
	    String user = "";
        String password = "";

        int attempts = 0;
        boolean loginSuccessful = false;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a user: ");
            user = input.nextLine();

            System.out.println("Enter a password: ");
            password = input.nextLine();

            attempts++;

            if (user.equalsIgnoreCase("TestUser") && password.equals("1234")) {
                System.out.println("Login successful");
                loginSuccessful = true;
                break;
            } else {
                System.out.println("Login error");
            }
        } while (attempts < 3);

        if (attempts >= 3 && !loginSuccessful) {
            System.out.println("Maximum attempts reached. User blocked");
        }

        input.close();
    }
	

}
