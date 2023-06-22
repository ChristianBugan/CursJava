package curs11;

import java.util.Properties;

public class TestPropertiesFileProcessor {

	public static void main(String[] args) {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("user");
		obj.updatePropertiesFile("email", "nimic");
		obj.updatePropertiesFile("browser", "thor");
		obj.deleteFromPropertiesFile("email");

	}

}
