package curs3;

public class StaticVsNonStatic {

	//variabila statica
	public static String nume;
	public static String departament = "QA";
	//variabile non-statica(variabila de instanta)
	
	public String prenume = "Christian";
	
	public static void main(String[] args) {
	
		/*
		System.out.println(StaticVsNonStatic.nume);
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		System.out.println(obj.prenume); */

		StaticVsNonStatic person = new StaticVsNonStatic();
		person.nume = "Oana";
		System.out.println(person.nume);
		System.out.println(person.departament);
		System.out.println("---------------------");
		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person2.nume = "Mario";
		System.out.println(person2.nume);
		System.out.println(person2.departament);
		System.out.println("---------------------");
		StaticVsNonStatic person3 = new StaticVsNonStatic();
		person2.nume = "Trei";
		departament = "DEV";
		System.out.println(person3.nume);
		System.out.println(person3.departament);
		System.out.println("---------------------");
		System.out.println(person.nume + person.departament);
		System.out.println(person2.nume + person2.departament);
		System.out.println(person3.nume + person3.departament);
	}

}
