package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterHashMap {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("First", "siva");
		map.put("Second", "Mahesh");
		map.put("Third", "sriman");
		map.put("Fourth", "shan");
		System.out.println(map);
		Set<String> set = map.keySet();
		for (String string : set) {
			System.out.println("Value of " + string + " is: " + map.get(string));
		}
	}
}
