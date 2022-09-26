package HashMap;

import java.util.HashMap;

public class Subset {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("First", "siva");
		map.put("Second", "Mahesh");
		map.put("Third", "sriman");
		map.put("Fourth", "shan");
		System.out.println(map);
		HashMap<String, String> map1 = new HashMap<>();
		map.put("s1", "s1 value");
		map.put("s2", "s2 value");
		map.putAll(map1);
		System.out.println(map);
	}
}
