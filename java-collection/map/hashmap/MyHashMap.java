package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyHashMap {
	public static void main(String[] args) {
		MyHashMap map = new MyHashMap();
		map.run();
	}

	private void run() {
		HashMap<String, User> map = new HashMap<String, User>();
		map.put("folau", new User("Folau"));
		map.put("lisa", new User("Lisa"));
		map.put("laulau", new User("Folauetau"));
		map.put("fusi", new User("Fusi"));
		map.put("folau", new User("Folau leka"));
		map.put(null, new User("Null Value"));
		map.put(null, null);
		map.put("Null Key", null);
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));// lambda with java 8.
		
		System.out.println("\nforeach using Map.Entry - map.entrySet()");
		for(Map.Entry<String, User> entry: map.entrySet()){
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
//		System.out.println("\nforeach using Object class - map.keySet()");
//		for(Object obj: map.keySet()){
//			System.out.println("Key : " + obj.toString() + " Value : " + map.get(obj.toString()));
//		}
//		System.out.println("\nforeach using Iterator<Entry<Key,Value>> iterator = map.entrySet().iterator()");
//		Iterator<Entry<String,User>> iterator = map.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String,User> entry = (Map.Entry<String,User>) iterator.next();
//			System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
//		}
	}
}
