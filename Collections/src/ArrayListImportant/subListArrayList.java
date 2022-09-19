package ArrayListImportant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class subListArrayList {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Zero");
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		al.add("Apparao");
		al.add("apparao");
		System.out.println(al);
		al.subList(2, 4);
//		Collections.sort(al);
//		System.out.println(al);
		Collections.sort(al, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
//				return o1.compareToIgnoreCase(o2);
				return o1.compareTo(o2);
			}

			
		});
		System.out.println(al);
		ArrayList al1 = new ArrayList<>();
		al1.add(17);
		al1.add(15);
		al1.add(10);
		al1.add(9);
		al1.add(10);
		// al1.add("a");
		Collections.sort(al1, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		System.out.println(al1);
	}
}
