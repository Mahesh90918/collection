package HashSet;

import java.util.HashSet;
import java.util.Iterator;

import ObjectElimination.student;

public class Example3 {
	public static void main(String[] args) {
		student s1 = new student(01, "mahesh");
		student s2 = new student(02, "sriman");
		student s3 = new student(03, "shan");
		HashSet<student> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		student s4 = new student(01, "mahesh");// duplicate value inserting
		student s5 = new student(02, "sriman");
		set.add(s4);
		set.add(s5);
		// serching Elements
		System.out.println(set.contains(s5));// true

		System.out.println(".....Iterator.......");
		Iterator<student> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// delete Object using remove method
		set.remove(s5);
		System.out.println(".....Iterator2......");
		Iterator<student> itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
//		System.out.println(".....For each Loop.......");
//		for (student student : set) {
//			System.out.println(student);
//		}
	}
}
