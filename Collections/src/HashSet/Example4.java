package HashSet;

import java.util.HashSet;

public class Example4 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	set.add("Zero");
	set.add("First");
	set.add("Second");
	set.add("Third");
	set.add("Fourth");
	System.out.println(set);
	String [] s= new String[set.size()];
	set.toArray(s);
	for (String string : s) {
		System.out.println(string);
	}
	HashSet set1= new HashSet();
	set1.add(1);
	set1.add("String");
	set1.add('c');
	set1.add(1.0);
	set1.add(996345);
	System.out.println(set1);
	
}
}
