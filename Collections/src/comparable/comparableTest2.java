package comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class comparableTest2 {
	// java.lang .package is available comparable
	 //Comparable meant for default natural sorting order.
	
	public static void main(String[] args) {
		TreeSet<student> set = new TreeSet<>();
		// Name based sorting
		set.add(new student(01, "siva"));
		set.add(new student(02, "shankar"));
		set.add(new student(05, "sriman"));
		set.add(new student(04, "shan"));
		set.add(new student(03, "mahesh"));
		for (student stu : set) {
			System.out.println(stu);
		}
	}
}
