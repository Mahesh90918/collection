package TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class subSetSorted {
	// Program: How to get subset from sorted set?
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		 ts.add("RED");
	        ts.add("ORANGE");
	        ts.add("BLUE");
	        ts.add("GREEN");
	        ts.add("WHITE");
	        ts.add("BROWN");
	        ts.add("YELLOW");
	        ts.add("BLACK");
	        System.out.println(ts);
	        Set<String> subSet = ts.subSet("GREEN", "WHITE");
	        System.out.println("sub set: "+subSet);
	        subSet = ts.subSet("GREEN", true, "WHITE", true);
	        System.out.println("sub set: "+subSet);
	        subSet = ts.subSet("GREEN", false, "WHITE", true);
	        System.out.println("sub set: "+subSet);
	}
}
