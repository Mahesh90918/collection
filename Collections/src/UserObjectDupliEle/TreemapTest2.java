package UserObjectDupliEle;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreemapTest2 {
	public static void main(String[] args) {

		TreeMap<student, String> map = new TreeMap<>(new Comparator<student>() {
			// id based sorting
			@Override
			public int compare(student o1, student o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}
		});
		student s1 = new student(04, "siva", 25000);
		student s2 = new student(03, "mahesh", 25000);
		student s3 = new student(01, "sriman", 25000);
		student s4 = new student(02, "shan", 25000);
		map.put(s1, "siva");
		map.put(s2, "mahesh");
		map.put(s3, "sriman");
		map.put(s4, "shan");
		// duplicate Entry
		student s5 = new student(02, "shan", 25000);// key duplicate
		student s6 = new student(01, "sriman", 25000);
		student s7 = new student(05, "Apparao", 25000);
		map.put(s5, "shan");
		map.put(s6, "sriman");
		map.put(s7, "siva");// value duplicate
		Set<Entry<student, String>> set = map.entrySet();
		for (Entry<student, String> entry : set) {
			System.out.println(entry.getKey() + "===>" + entry.getValue());
		}
		System.out.println("...................");
		Set<student> set1 = map.keySet();
		for (student student : set1) {
			System.out.println(student + "==>" + map.get(student));

		}
	}
}
