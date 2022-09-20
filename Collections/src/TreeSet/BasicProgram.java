package TreeSet;

import java.util.TreeSet;

public class BasicProgram {
	// insertion order not preserved
	// duplicates not allowed
	// null does not allowed in Treeset
	// only Homogenious allow // classcastException Occur
	// Sorting order is Availble (compare to Strings unique code representation)
	public static void main(String[] args) {
		TreeSet<String> tr = new TreeSet<>();
		tr.add("Zero");
		tr.add("First");
		tr.add("Second");
		tr.add("Third");
		tr.add("Fourth");
		tr.add("Fourth");
		// tr.add(null);// does not allow the null values
		System.out.println(tr);

//		TreeSet tr1 = new TreeSet<>();
//		tr1.add("Zero");
//		tr1.add(1);
//		tr1.add("Second");
//		tr1.add(2);
//		System.out.println(tr1);

	}
}
