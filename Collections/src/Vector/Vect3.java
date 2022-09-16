package Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vect3 {
	// How to add all elements of a list to vector?
	public static void main(String a[]) {
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		List list = new ArrayList();
		list.add("One");
		list.add("Two");
		vct.addAll(list);
		System.out.println("After Copy: " + vct);
	}
}
