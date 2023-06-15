package curs10;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map <String, String> map = new HashMap<>();
		
		//check size of map --> return type de tip int
		System.out.println(map.size());
		
		//check if map is Empty or not --> return type de tip boolean
		System.out.println(map.isEmpty());
		
		//add objects to map
		map.put("T", "Tester");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("D", "Developer");
		map.put("P", "ProductOwner");
		map.put("M", "Manager");
		
		System.out.println(map);
		
		//get value
		System.out.println(map.get("M"));
		
		System.out.println("----------------------------------");
		
		//get all keys
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		//get all values
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		
		System.out.println("Before update: " + map);
		//remove
		map.remove("M");
		
		map.put("P", "ProductManager");
		map.put("PM", "ProductManager");
		
		//update key
		map.replace("T", "Automation");
		
		System.out.println("After update: " + map);
		
		//check if specified key is in map
		System.out.println(map.containsKey("X"));
		System.out.println(map.containsKey("PM"));
		
		//check if specified value is in map
		System.out.println(map.containsValue("Automation"));
		System.out.println(map.containsValue("Doctor"));
	}

}
