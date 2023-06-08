package curs8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		
		try {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert num1: ");
		int num1 = scan.nextInt();
		
		System.out.println("Please insert num2: ");
		int num2 = scan.nextInt();
		
		num2 = (Integer) null;
		System.out.println(num1/num2);
		
		}catch(InputMismatchException obj) {
			System.out.println("Please insert only numeric!");
		}catch (ArithmeticException e) {
			System.out.println("Please do not divide by 0!");
		}catch (NullPointerException e) {
			System.out.println("null pointer error occured!");
		}catch(Exception obj) {
			System.out.println("Something went wrong!");
			obj.printStackTrace();
			System.out.println(obj.getMessage());
		}
		
		
	}

}
