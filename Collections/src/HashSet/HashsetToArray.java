package HashSet;

import java.util.HashSet;

public class HashsetToArray {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Zero");
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
		System.out.println(set);
		
		String s[] =new String[set.size()];
		set.toArray(s);
		for (String string : s) {
			System.out.println(string);
		}
		
}
}