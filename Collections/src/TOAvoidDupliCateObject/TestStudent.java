package TOAvoidDupliCateObject;

import java.util.Comparator;
import java.util.TreeSet;

public class TestStudent {
	/*
	 * Program: How to avoid duplicate user defined objects in TreeSet?
	 * 
	 * Description: To avoid duplicate user defined objects in TreeSet, you have to
	 * implement Comparator interface with equality verification. Below example
	 * gives a sample code to implement it
	 */
	public static void main(String[] args) {

		TreeSet<student> set = new TreeSet<student>(new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}
		});
		student s1 = new student(01, "siva", 25000);
		student s2 = new student(02, "sriman", 25000);
		student s3 = new student(03, "shan", 25000);
		student s4 = new student(04, "mahesh", 25000);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		// donot allowed same id values using comparator
		student s5 = new student(04, "mahesh", 25000);
		student s6 = new student(04, "shan", 25000);
		set.add(s5);
		set.add(s6);
		for (student stu : set) {
			System.out.println(stu);

		}
	}
}
