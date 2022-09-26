package TreeMap;

import java.util.TreeMap;

public class Basic2 {
public static void main(String[] args) {
	TreeMap<String, Integer> map = new TreeMap<>();
	// String based key sorting
	// key not null we will get NullpointerException
	map.put("First", 1);
	map.put("Second", 2);
	map.put("Third", 3);
	map.put("Fourth", 4);
	map.put("Fifth", 5);
	map.put("Six", null);
	System.out.println(map);
}
}
