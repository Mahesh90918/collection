package HashSet;

import java.util.HashSet;

public class DuplicateRemove {
//How to eliminate duplicate user defined objects from HashSet?

	// Below example shows how to avoid duplicate user defined objects from HashSet.
	// You can achieve this by implementing equals and hashcode methods
	// at the user defined objects.

	public static void main(String[] args) {
		HashSet<String> s= new HashSet<>();
		s.add("mahesh");
		s.add("sriman");
		s.add("shan");
		s.add("sriman");
		s.add("shan");
		s.add("mahesh");
		System.out.println(s);
	

	}

}
