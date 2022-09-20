package HashSet;

import java.util.HashSet;

public class SetToAnotherSet {
//How to copy Set content to another HashSet?
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Zero");
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
		HashSet<String> set1=new HashSet<String>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("Five");
		set1.add("Six");
		System.out.println("HashSet content after adding another collection:");
		set.addAll(set1);
		System.out.println(set);
		
	}
}
