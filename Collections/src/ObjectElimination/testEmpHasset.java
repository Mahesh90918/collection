package ObjectElimination;

import java.util.HashSet;

public class testEmpHasset {
	//Program: How to eliminate duplicate user defined objects from HashSet?
	public static void main(String[] args) {
		HashSet<student> set = new HashSet<>();
		student s1 = new student(01, "mahesh");
		student s2 = new student(02, "shan");
		student s3 = new student(03, "sriman");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		// duplicate values are ALLOWED when you cannot OVERRIDE EQUALS AND HASCODES
		// METHODS
		// duplicate values are NOT ALLOWED when you can OVERRIDE EQUALS AND HASCODES
		// METHODS

		// insert duplicate values
		student s4 = new student(01, "mahesh");
		student s5 = new student(02, "shan");
		set.add(s4);
		set.add(s5);


		System.out.println(set);
		for (student stu : set) {
			System.out.println(stu);
		}

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}
}
