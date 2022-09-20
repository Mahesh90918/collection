package ObjectElimination;

import java.util.LinkedHashSet;

public class LinkedHassetTest {
	public static void main(String[] args) {
		LinkedHashSet<student> lk = new LinkedHashSet<>();
		student s1 = new student(01, "mahesh");
		student s2 = new student(02, "shan");
		student s3 = new student(03, "sriman");
		student s4 = new student(01, "mahesh");
		student s5 = new student(03, "sriman");
		lk.add(s1);
		lk.add(s2);
		lk.add(s3);
		lk.add(s4);
		lk.add(s5);

		System.out.println(lk);
		// serching operation or finding the object
		System.out.println(lk.contains(s5));
		System.out.println(lk);
		// delete object
		// Both same objects are delete in remove method
		System.out.println(lk.remove(s5));
		System.out.println(lk);
		System.out.println(lk.contains(s5));// same objects
		System.out.println(lk.contains(s3));// same objects 

	}
}
