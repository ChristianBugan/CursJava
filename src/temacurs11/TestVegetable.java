package temacurs11;

import java.util.Scanner;

public class TestVegetable {

	public static void main(String[] args) {


        VegetableCalories obj = new VegetableCalories();
        obj.writePropertiesFile();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele legumei dorite: ");
        String vegetable = scanner.nextLine();
        
       

        obj.readPropertiesFile(vegetable);
    }
}
