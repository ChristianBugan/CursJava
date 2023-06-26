package curs12;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.*;
import java.io.*;

public class JsonFileProcessor {
	
	@SuppressWarnings("unchecked")
	public void writeJsonFile() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "TestUser123");
		obj.put("email", "email@testuser.com");
		
		JSONArray list = new JSONArray();
		list.add("Obiect 1");
		list.add("Obiect 2");
		list.add("Obiect 3");
		list.add("Obiect 4");
		list.add("Obiect 5");
		
		obj.put("listaObiecte", list);
		
		try(FileWriter file = new FileWriter("test.json")){
			
			file.write(obj.toJSONString());

		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void readJson(String key) {
		try(FileReader file = new FileReader("test.json")){
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject)  parser.parse(file);
			
			//System.out.println(jsonObj);
			System.out.println("Key: " + jsonObj.get(key));
			
			JSONArray lista = (JSONArray) jsonObj.get("listaObiecte");
			//System.out.println("Obj lista" + lista.get(1));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void updateJsonFile(String key, String value) {
		
		try(FileReader file = new FileReader("test.json")){
			
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject) parser.parse(file);
			jsonObj.put(key, value);
			
			try(FileWriter fileOutput = new FileWriter("test.json")){
				
				fileOutput.write(jsonObj.toJSONString());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteFromJson(String key) {
		
	try(FileReader file = new FileReader("test.json")){
			
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject) parser.parse(file);
			jsonObj.remove(key);
			
			try(FileWriter fileWriter = new FileWriter("test.json")){
				fileWriter.write(jsonObj.toJSONString());
				fileWriter.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
	
}
