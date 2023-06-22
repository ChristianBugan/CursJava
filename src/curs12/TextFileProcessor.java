package curs12;

import java.io.IOException;
import java.io.*;

public class TextFileProcessor {

	public void writeTxt(String text) {
		
		try(FileWriter fileWriter = new FileWriter("test.txt")){
			
			fileWriter.write(text);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
