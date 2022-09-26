package HashMap;

import java.util.HashMap;
import java.util.Set;

public class AllKeyValues {
	/*
	 * Program: How to get all keys from HashMap?
	 * 
	 * Description: Below example shows how to get all keys from the given HashMap.
	 * By calling keySet() method, you can get set object with all key values.
	 */public static void main(String[] args) {
			HashMap<String, String> map = new HashMap<>();
			map.put("First", "siva");
			map.put("Second", "mahesh");
			map.put("Third", "sriman");
			map.put("Fourth", "shan");
			System.out.println(map);
			System.out.println("....keys.......");
			Set<String> set= map.keySet();
			for (String str : set) {
				System.out.println(str);
			}
	}

}
