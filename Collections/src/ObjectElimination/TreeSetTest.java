package ObjectElimination;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<student> set = new TreeSet<>(new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
				// return o1.getId()-o2.getId();
			}
		});
		student s1 = new student(01, "mahesh");
		student s2 = new student(02, "shan");
		student s3 = new student(04, "sriman");
		student s4 = new student(03, "apparao");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set);
	}
}
