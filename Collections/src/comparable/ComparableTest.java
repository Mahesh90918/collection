package comparable;

import java.util.TreeSet;

public class ComparableTest {
	// java.lang .package is available comparable
	public static void main(String[] args) {
		TreeSet<student> set = new TreeSet<>();
		// Id based sorting
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
