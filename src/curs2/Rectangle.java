package curs2;

public class Rectangle {

	private int lenght;
	private int width;
	
	public Rectangle(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;	
	}
	
	public int calculateArea() {
		return lenght * width;
	}
	
}
