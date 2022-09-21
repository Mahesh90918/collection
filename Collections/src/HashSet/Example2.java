package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Example2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Zero");
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		System.out.println(set);
		System.out.println(set.contains("Zero"));
		Set<String> set1 = new HashSet<>();
		set1.add("Zero");
		set1.add("First");

		System.out.println(set1);
		// serching Operation
		System.out.println(set.containsAll(set1));// true
		System.out.println("Serching operation 1:" + set);
		set1.contains(set);
		System.out.println(set1.containsAll(set));// false
		System.out.println("Serching operation 2:" + set1);

		// same data serching
		set1.retainAll(set);
		System.out.println(set1);
		System.out.println(set.retainAll(set1));// true
		System.out.println(set1.retainAll(set));// false
		
		System.out.println("....................");
		set.removeAll(set1);
		System.out.println(set);
		set1.removeAll(set);
		System.out.println(set1);
	}
}
