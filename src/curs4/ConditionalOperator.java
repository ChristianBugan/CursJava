package curs4;

import java.util.Scanner;

/*
 * Program care citeste de la tastatura 2 numere si verifica urmatoarele
 * - daca fiecare numar este pozitiv
 * - daca ambele numere sunt pozitive 
 * - care dintre cele 2 numere este cel mai mic (verificam si daca sunt egale)  
 * 
 * Printam:
 * exemplu: Num1 este pozitiv
 * Daca ambele sunt pozitive: Numerele sunt pozitive 
 * Care este cel mai mic / cel mai mare
 * 
 * facem 2 implementari:
 * implementare cu if -else
 * implementare cu ternary (conditional) operator
 * 
 */

public class ConditionalOperator {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu primul numar: ");
		num1 = scan.nextInt();
		System.out.println("Te rog introdu al doilea numar: ");
		num2 = scan.nextInt();
		
		if(num1 >0) {
			System.out.println("Num1 este pozitiv");
		}else {
			System.out.println("Num1 este negativ");
		}
		
		if(num2 >0) {
			System.out.println("Num2 este pozitiv");
		}else {
			System.out.println("Num2 este negativ");
		}
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("Numerele sunt pozitive");
		}else {
			System.out.println("Cel putin un numar este negativ");
		}
		
		if(num1 > num2) {
			System.out.println("Num1 este mai mare");
		}else if(num2 > num1) {
			System.out.println("Num 2 este mai mare");
		}else {
			System.out.println("Sunt egale");
		}
		
		System.out.println("-----------------------------");
		//result = conditie ? expresie1(true):expresie2(false)
		
		String y = (num1>0)?"Num1 este pozitiv" : "Num1 este negativ";
		System.out.println(y);
		y = (num2>0)?"Num2 este pozitiv" : "Num2 este negativ";
		System.out.println(y);
		y = (num1 > 0 && num2 > 0)?"Numerele sunt pozitive" : 
			"Cel putin un numar este negativ";
		System.out.println(y);
		
		y = (num1>num2)?"Num1 este mai mare":(num2>num1)?"Num2 este mai mare":"Sunt egale";
		System.out.println(y);
		
	}
	
}
