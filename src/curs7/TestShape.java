package curs7;

public class TestShape {

	public static void main(String[] args) {
		
		Square patrat = new Square("cerc", "verde");
		System.out.println(patrat.culoare);
		System.out.println(patrat.nume);
		
		patrat.printDetails();

	}

}
