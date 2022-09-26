package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class basic {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("first", 1);
		map.put("Second", 3);
		map.put("Third", 4);
		map.put("fourth", null);
		map.put("fifth", null);
		map.put(null, 2);
		map.put(null, 3);// update data allowed key one time
		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + " ==>" + entry.getValue());
		}
		Set s= map.keySet();
		for (Object object : s) {
			System.out.println(s+"==>" +map.get(s));
		}
	}
}
