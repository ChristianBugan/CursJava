package temacurs2;

public class Shape {
    
	private double area;

    public Shape(int length) {
        calculateSquareArea(length);
    }

    public Shape(int length, int width) {
        calculateRectangleArea(length, width);
    }

    public Shape(double radius) {
        calculateCircleArea(radius);
    }

    private void calculateSquareArea(int length) {
        area = length * length;
    }

    private void calculateRectangleArea(int length, int width) {
        area = length * width;
    }

    private void calculateCircleArea(double radius) {
        area = radius * radius * Math.PI;
    }

    public double getArea() {
        return area;
    }
}
