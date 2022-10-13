package HashTable;

import java.util.Hashtable;

public class hashtable {
	public static void main(String[] args) {
		Hashtable<String, Integer> has = new Hashtable<>();
		has.put("Zero", 1);
		has.put("First", 3);
		has.put("second", 4);
		has.put("Third", 1);
		has.put("Third", null);
		// has.put(null, 6);
		System.out.println(has);
		/*
		 * Exception in thread "main" java.lang.NullPointerException at
		 * java.base/java.util.Hashtable.put(Hashtable.java:475) at
		 * HashTable.hashtable.main(hashtable.java:12)
		 */
	}
}
