package UserObjectDupliEle;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMaptest {
	// inseration order preserved
	public static void main(String[] args) {
		LinkedHashMap<student, String> map = new LinkedHashMap<>();
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
		student s7 = new student(05, "sivaaa", 25000);
		map.put(s5, "shan");
		map.put(s6, "sriman");
		map.put(s7, "siva");// value duplicate
		Set<Entry<student, String>> set = map.entrySet();
		for (Entry<student, String> entry : set) {
			System.out.println(entry.getKey() + " ==>" + entry.getValue());
		}
		System.out.println("...................");
		Set<student> set1=map.keySet();
		for (student student : set1) {
			System.out.println(student+"==>" +map.get(student));
			
		}
	}
}
