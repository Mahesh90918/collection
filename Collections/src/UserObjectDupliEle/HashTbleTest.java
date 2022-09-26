package UserObjectDupliEle;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTbleTest {
	public static void main(String[] args) {
		Hashtable<student, String> table = new Hashtable<>();
		student s1 = new student(04, "siva", 25000);
		student s2 = new student(03, "mahesh", 25000);
		student s3 = new student(01, "sriman", 25000);
		student s4 = new student(02, "shan", 25000);

		table.put(s1, "siva");
		table.put(s2, "mahesh");
		table.put(s3, "sriman");
		table.put(s4, "shan");
		student s5 = new student(02, "shan", 25000);
		table.put(s5, "shan");
		student s6 = new student(05, "mahesh", 25000);
		table.put(s6, "shan");//duplicate value
		student s7= new student(07, "mahesh", 25000);
		//table.put(s7, null);// not allow null value 
		System.out.println(table);
		Set<student> set = table.keySet();
		for (student student : set) {
			System.out.println(student +" ==>"+table.get(student));
		}
		System.out.println("................");
		Iterator itr=table.entrySet().iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
