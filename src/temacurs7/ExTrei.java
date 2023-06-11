package temacurs7;

import java.util.Scanner;

public class ExTrei {

/*
 * Scriem un program care intreaba utilizatorul 10 numere.
 * Cele 10 numere le tinem intr-un array si le printam doar pe cele care sunt pare
 * Scriem rezolvarea folosind "FOR" , dar si o rezolvare folosind "WHILE" 	
 */
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        // Citim cele 10 numere de la utilizator
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Introdu numarul " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numerele pare (folosind FOR):");
        printEvenNumbersFor(numbers);

        System.out.println("Numerele pare (folosind WHILE):");
        printEvenNumbersWhile(numbers);

        scanner.close();
    }

    public static void printEvenNumbersFor(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void printEvenNumbersWhile(int[] numbers) {
        int index = 0;
        while (index < numbers.length) {
            if (numbers[index] % 2 == 0) {
                System.out.println(numbers[index]);
            }
            index++;
        }

	}

}
