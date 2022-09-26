package UserObjectDupliEle;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	/*
	 * Program: How to eliminate duplicate user defined objects as a key from
	 * HashMap?
	 * 
	 * Description: Below example shows how to avoid duplicate user defined objects
	 * as a key from HashMap. You can achieve this by implementing equals and
	 * hashcode methods at the user defined objects.
	 */
	public static void main(String[] args) {
		// inseration order not preserved
		student s1 = new student(02, "siva", 25000);
		student s2 = new student(01, "mahesh", 25000);
		student s3 = new student(03, "sriman", 25000);
		student s4 = new student(04, "shan", 25000);
		HashMap<student, String> map = new HashMap<>();
		map.put(s1, "siva");
		map.put(s2, "mahesh");
		map.put(s3, "sriman");
		map.put(s4, "shan");
		System.out.println(map);
		// duplicate Entry
		student s5 = new student(04, "shan", 25000);// key duplicate
		student s6 = new student(03, "sriman", 25000);
		student s7 = new student(05, "sivaaa", 25000);
		map.put(s5, "shan");
		map.put(s6, "sriman");
		map.put(s7, "siva");
		Set<Entry<student, String>> set = map.entrySet();
		for (Entry<student, String> entry : set) {
			System.out.println(entry.getKey() + " ==>" + entry.getValue());
		}
		 System.out.println("Does key available? "+map.containsKey(s5));
		 System.out.println("Does key available? "+map.containsValue("mahesh"));
//		Set<student> set = map.keySet();
//		for (student stu : set) {
//			System.out.println(map + "==>" + map.get(stu));
//		}
			System.out.println("...................");
			Set<student> set1=map.keySet();
			for (student student : set1) {
				System.out.println(student+"==>" +map.get(student));
				
			}
	}
}
