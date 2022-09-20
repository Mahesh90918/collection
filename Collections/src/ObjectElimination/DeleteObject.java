package ObjectElimination;

import java.util.HashSet;

public class DeleteObject {
	/*
	 * Program: How to delete user defined objects from HashSet?
	 * 
	 * Description: Below example shows how to delete user defined objects from
	 * HashSet. You can achieve this by implementing equals and hashcode methods at
	 * the user defined objects.
	 */
	public static void main(String[] args) {
		HashSet<student> set = new HashSet<>();
		student s1 = new student(01, "mahesh");
		student s2 = new student(02, "shan");
		student s3 = new student(03, "sriman");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		student s4 = new student(01, "mahesh");
		student s5 = new student(02, "shan");
		set.add(s4);
		set.add(s5);

		System.out.println(set);
		System.out.println("....Delete Object.......");
		// Both same objects are delete in remove method
		System.out.println(set.remove(s1));
		System.out.println(set);

	}
}
