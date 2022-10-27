package com.important;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
	public static void main(String[] args) {
		ArrayList<Empolyee> al = new ArrayList<>();
		al.add(new Empolyee(01, "siva", 10000));
		al.add(new Empolyee(02, "shankar", 20000));
		al.add(new Empolyee(03, "mahesh", 15000));
		al.add(new Empolyee(04, "ravi", 25000));
		al.add(new Empolyee(05, "sriman", 30000));
		al.add(new Empolyee(06, "shan", 25000));
		

		Iterator<Empolyee> itr = al.iterator();

//		for (Empolyee empolyee : al) {
//			
//			if (itr.next().getSalary()==25000) {
//				System.out.println(empolyee);
//			}
//		}

//		for (Empolyee empolyee : al) {
//			if (itr.next().getName().equals("shan")) {
//				System.out.println(empolyee);
//			}
//		}

		for (Empolyee empolyee : al) {
			if (itr.next().getName().startsWith("r")) {
				System.out.println(empolyee);
			}
		}
		// not working
//		for (Empolyee empolyee : al) {
//			if (empolyee.getName().equalsIgnoreCase(getName().startsWith("s"))) {
//				System.out.println(empolyee);
//			}
//		}
	}
}
