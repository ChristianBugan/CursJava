package curs10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabriel");
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(nume);
		}

		
		list.add("Carmen");
		
		System.out.println("----------------");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		list.add(0, "George");
		list.add(4, "George");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume );
		}
		
		System.out.println("Element index 4: " + list.get(4));
		
		list.add(7, "Ioana");
		System.out.println("----------------");
		
		//remove from list
		list.remove(3);
		list.remove("George");
		
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume );
		}
		
		
		//remove all from list
		list.clear();
		System.out.println(list.isEmpty());
		
		
	}

}
