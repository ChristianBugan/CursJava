package curs2;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle obj1 = new Rectangle(3, 4);
		System.out.println(obj1.calculateArea());
		int sum = 20 + obj1.calculateArea();
		System.out.println(sum);

	}

}
