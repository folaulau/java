package treemap;

import java.util.TreeMap;

public class MyTreeMap {
	public static void main(final String[] args) {
		final MyTreeMap tree = new MyTreeMap();
		tree.run();
	}

	private void run() {
		final TreeMap<String, User> map = new TreeMap<String, User>();
		map.put("Folau", new User("Folau"));
		map.put("Laulau", new User("Folaulau"));
		map.put("Fusi", new User("Fusi"));
		map.put("Kinga", new User("Kinga"));
		System.out.println("foreach using Object class - map.keySet()");
		for (final Object obj : map.keySet()) {
			System.out.println("Key : " + obj.toString() + " Value : " + map.get(obj.toString()));
		}
	}
}
