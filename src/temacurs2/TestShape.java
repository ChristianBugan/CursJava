package temacurs2;

public class TestShape {
    public static void main(String[] args) {
        Shape patrat = new Shape(8);
        Shape dreptunghi = new Shape(4, 2);
        Shape cerc = new Shape(3.0);

        double squareArea = patrat.getArea();
        double rectangleArea = dreptunghi.getArea();
        double circleArea = cerc.getArea();

        print("The area of the square is: " + (int) squareArea);
        print("The area of the rectangle is: " + (int) rectangleArea);
        print("The area of the circle is: " + circleArea);
         
    }
    
    private static void print(String message) {
        System.out.println(message);
    }
 
}