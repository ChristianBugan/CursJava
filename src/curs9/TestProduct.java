package curs9;

public class TestProduct {

	public static void main(String[] args) {
		
	//	Product product = new Product();
		
	Laptop laptop = new Laptop(123, 19, 5);	
	System.out.println(laptop.calculatePrice());
	laptop.productRating();
	
	System.out.println("---------------------------------");
	
	MobilePhone mobile = new MobilePhone(100, 19);
	System.out.println(mobile.calculatePrice());
	mobile.productRating();
	
	}

}
