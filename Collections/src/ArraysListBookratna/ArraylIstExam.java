package ArraysListBookratna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylIstExam {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("mahesh");
		al.add(1000);
		al.add("mahesh");
		al.add(null);
		System.out.println(al);
//	al.remove(0);
//	System.out.println(al);
		// copy of array
		ArrayList al1 = new ArrayList<>(al);
		System.out.println(al1);
// No of copies
		ArrayList al2 = new ArrayList<>(Collections.nCopies(3, al));
		System.out.println(al2);

		// AsList
		ArrayList al3 = new ArrayList<>(Arrays.asList(al, al1, al2));
		System.out.println(al3);

		ArrayList al4 = new ArrayList<>();
		al4.addAll(al);
		al4.add("sriman");
		al4.add("shan");
		System.out.println(al4);

		ArrayList al5 = new ArrayList<>();
		al5.add(al.clone());
		al5.add("unukuru");
		al5.add("Srikakulam");
		System.out.println("clone :" + al5);
		System.out.println("contains :" + al5.contains(al1));
		System.out.println("contains :" + al5.contains("unukuru"));

		ArrayList al6 = new ArrayList<>();
		al6.addAll(al5);
		System.out.println(al6);
		System.out.println("Sub List  :"+al6.subList(0, 2));
		Collections.addAll(al5, 3);
		Collections.addAll(al5, "siva");
		
		System.out.println("contain All  "+al5.containsAll(al1));
		System.out.println("Original :"+al5);
		Collections.swap(al5, 1, 4);
		System.out.println("Swap :"+al5);
		

	}
}
