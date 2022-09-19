package usingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testStudent {
//	How to sort ArrayList using Comparator?

	public static void main(String[] args) {
		Student s1 = new Student(01, "shankar", 25000);
		Student s2 = new Student(05, "siva", 25000);
		Student s3 = new Student(03, "shan", 25000);
		Student s4 = new Student(04, "Hari", 25000);
		Student s5 = new Student(02, "mahesh", 25000);
		Student[] s = { s1, s2, s3, s4 };

		ArrayList al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		// 1.way This is
		// Collections.sort(al, new NumberComparator());
		// 2. way java8
		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getId() - o2.getId();
			}
		});

		System.out.println(".....Number Comparator...........");
		System.out.println(al);
		for (Object object : al) {
			System.out.println(object);

		}
		Collections.sort(al, new NameComparator());
		System.out.println(".....Name Comparator...........");
		System.out.println(al);
		for (Object object : al) {
			System.out.println(object);

		}
	}
}
