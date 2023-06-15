package curs10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		List<String> list = 
				new ArrayList<>(Arrays.asList("verde", "alb", "galben", "rosu", "negru", "mov"));
		
		System.out.println(list.size());
		list.add("roz");
		System.out.println(list.size());
		
		System.out.println(list.contains("gri"));
		System.out.println(list.contains("roz"));
		
		System.out.println("------------<>------------");
		
		//update
		System.out.println("Before update: " + list);
		
		list.set(3, "red");
		
		//after update
		System.out.println("After update: " + list);
		
		//working with range
		System.out.println(list.subList(1, 3));
		boolean isThere = list.subList(1, 4).contains("galben");
		System.out.println(isThere);
		list.subList(1, 4).clear();
		System.out.println("After update: " + list);
	}

}
