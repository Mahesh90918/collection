package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {
	/*
	 * Program: How to get entry set from HashMap?
	 * 
	 * Description: Below example shows how to get all key-value pair as Entry
	 * objects. Entry class provides getter methods to access key-value details. The
	 * method entrySet() provides all entries as set object.
	 */
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("First", "siva");
		map.put("Second", "mahesh");
		map.put("Third", "sriman");
		map.put("Fourth", "shan");
		System.out.println(map);
		System.out.println("....Entry.......");
		// getting value for the given key from hashmap
		Set<Entry<String, String>> entires = map.entrySet();
		for (Entry<String, String> entry : entires) {
			System.out.println(entry.getKey() +" ==>"+entry.getValue());
		}
		System.out.println("Clearing HashMap:");
        map.clear();
        System.out.println("Content After clear:");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println("...................");
       
	}
}
