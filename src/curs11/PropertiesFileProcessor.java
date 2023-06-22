package curs11;

import java.io.*;
import java.util.Properties;


public class PropertiesFileProcessor {

	
	public void writePropertiesFile() {
		
		try (
			FileOutputStream outputStream = new FileOutputStream("test.properties");
			){
		
		Properties propFile = new Properties();
		propFile.setProperty("user", "admin123");
		propFile.setProperty("pass", "admin123");
		propFile.setProperty("email", "admin@admin.com");
		
		propFile.store(outputStream, "Am salvat fisierul");
			
			
			
		//outputStream.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void readPropertiesFile(String key) {
		
		try (
				FileInputStream inputStream = new FileInputStream("test.properties")
			)
				{
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
			System.out.println(propFile.getProperty(key));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void updatePropertiesFile(String key, String value) {
		
		Properties prop = new Properties();
		
		try(FileInputStream input = new FileInputStream("test.properties")){
			
			prop.load(input);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileOutputStream output = new FileOutputStream("test.properties")){
			
			prop.setProperty(key, value);
			prop.store(output, null);
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
	
	public void deleteFromPropertiesFile(String key) {
	
		Properties prop = new Properties();
		
		try(FileInputStream input = new FileInputStream("test.properties")){
			
			prop.load(input);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileOutputStream output = new FileOutputStream("test.properties")){
			
			prop.remove(key);
			prop.store(output, null);
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
	
	
}
