package curs12;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class TextFileProcessor {

	public void writeTxt(String text) {
		
		try(FileWriter fileWriter = new FileWriter("test.txt")){
			
			fileWriter.write(text);
			
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void readTxt() {
		try(Scanner scan = new Scanner(new File("test.txt"))){
			
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void updateTxtFile(String textToUpdate) {
		
		try(FileWriter file = new FileWriter("test.txt", true)){
			
			file.append(textToUpdate);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
