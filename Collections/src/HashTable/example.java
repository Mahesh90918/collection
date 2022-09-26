package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class example {
	public static void main(String[] args) {
		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("one", 1);
		table.put("two", 2);
		table.put("five", 5);
		table.put("four", 4);
		table.put("three", 3);
		table.put("six", 6);
		// System.out.println(table);
		Enumeration<String> e = table.keys();
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			System.out.println(key + " " + table.get(key));
		}
	}
}
