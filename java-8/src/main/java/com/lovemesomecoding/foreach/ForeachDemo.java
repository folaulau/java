package com.lovemesomecoding.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachDemo {

	public static void main(String[] args) {
		//foreachWithList();
		foreachWithMap();
	}
	
	public static void foreachWithMap() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		//items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
	}

	public static void foreachWithList() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		// lambda
		// Output : A,B,C,D,E
		items.forEach(item -> System.out.println(item));

		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		// Output : A,B,C,D,E
		items.forEach(System.out::println);

		// Stream and filter
		// Output : B
		items.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}
}
