package temacurs11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/*
 * Scriem un program care printeaza in consola cate calorii are o leguma pe care utilizatorul vrea sa o cumpere
 * 
 * Avem o metoda care scrie intr-un properties file 5 legume si un numar de calorii asociat lor
 * Avem o metoda care citeste si din properties file valoarea caloriilor
 * 
 * Daca utilizatorul introduce o leguma care nu se afla in acest data structure
 *   atunci returnam mesajul: "Nu vindem aceasta leguma"
 *   
 * In metoda main intrebam utilizatorul ce leguma vrea sa cumpere.
 * Daca leguma sa afla in fisierul properties cu cele 5 leguma atunci printam :  
 *    "Leguma aleasa de tine are X calorii" 
 *    
 * Daca nu se afla in fisier atunci printam: 
 *    "Nu vindem aceasta leguma" si rugam utilizatorul sa aleaga alta leguma
 * 
 */

public class VegetableCalories {
	
	private Properties propFile;
	
	public VegetableCalories() {
        propFile = new Properties();
	}
	
	public void writePropertiesFile() {
		
		try (
			FileOutputStream outputStream = new FileOutputStream("vegetable.properties");
			){
		
		Properties propFile = new Properties();
		propFile.setProperty("Morcov", "50");
		propFile.setProperty("Castravete", "20");
		propFile.setProperty("Cartof", "100");
		propFile.setProperty("Ardei", "80");
		propFile.setProperty("varza", "125");
		
		
		propFile.store(outputStream, "Am salvat fisierul");
			
			
			
		//outputStream.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void readPropertiesFile(String key) {
		
		try (
				FileInputStream inputStream = new FileInputStream("vegetable.properties")
			)
				{
			
			propFile.load(inputStream);
			String calories = propFile.getProperty(key);
			
			if (calories != null) {
                System.out.println("Leguma aleasa de tine are " + calories + " calorii");
            } else {
                System.out.println("Nu vindem aceasta leguma. \n Te rugam sa alegi alta.");
            }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void updatePropertiesFile(String key, String value) {
        try (FileOutputStream output = new FileOutputStream("vegetable.properties")) {

            propFile.setProperty(key, value);
            propFile.store(output, null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
