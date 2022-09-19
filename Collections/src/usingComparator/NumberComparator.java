package usingComparator;

import java.util.Comparator;

public class NumberComparator implements Comparator<Student> {
//1.way this is
// @Override
//	public int compare(Student o1, Student o2) {
//		if (o1.getId() > o2.getId()) {
//			return +1;
//		}
//		if (o1.getId() < o2.getId()) {
//			return -1;
//		}
//		return 0;
//	}
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getId()-o2.getId();
	}

}
