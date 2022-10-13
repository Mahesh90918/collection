package HashTable;

import java.util.HashMap;

public class hashmap {
public static void main(String[] args) {
	HashMap<String, Integer> has= new HashMap<>();
	has.put("Zero", 1);
	has.put("First", 3);
	has.put("second", 4);
	has.put("Third", 1);
	has.put(null, 2);
	has.put(null, 6);
	has.put("1", null);
	has.put("2" , null);
	System.out.println(has);
}
}
