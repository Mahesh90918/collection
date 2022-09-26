package TreeMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class basic {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		// String based key sorting
		map.put("First", 1);
		map.put("Second", 2);
		map.put("Third", 3);
		map.put("Fourth", 4);
		map.put("Fifth", 5);
		map.put("Six", 6);
		System.out.println(map);
		TreeMap<Integer, String> map1 = new TreeMap<>();
		// Integer based key sorting
		map1.put(3, "first value");
		map1.put(2, "second value");
		map1.put(1, "third value");
		map1.put(4, "fourth value");
		System.out.println(map1);
		System.out.println("................");
		// name based
		Set s = map.keySet();
		for (Object object : s) {
			System.out.println(object + "==> " + map.get(object));
		}
		System.out.println("................");
		// id based
		Set s1 = map1.keySet();
		for (Object object : s1) {
			System.out.println(object + "==> " + map1.get(object));
		}
       System.out.println("...........Iterator..............");
		Iterator i = map.entrySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
