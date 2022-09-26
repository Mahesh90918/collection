package comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorCustomCreation2 {
	// Comparator meant for customized sorting order.
	// Present in java.util package.
	public static void main(String[] args) {
		Comparator<student> comp = new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				return o1.getId() - o2.getId();// Ascending order
				// return o2.getId()-o1.getId()// Descending order
			}
		};
		TreeSet<student> set = new TreeSet<>(comp);
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
