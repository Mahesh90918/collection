package HashSet;

import java.util.HashSet;

public class CompareToSets {
//Program: How to compare two sets and retain elements which are same on both sets?

	// Below example shows how to compare two sets, and retain
	// the values which are common on both set objects.
	// By calling retainAll() method you can do this operation.
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Zero");
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fith");
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Zero");
		set1.add("First");
		set1.add("Second");
		set1.add("siva");
		set1.add("mahesh");
		System.out.println(set);
		 System.out.println("HashSet content:");
		set.retainAll(set1);
		System.out.println(set);

	}

}
