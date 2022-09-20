package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class leastValueFind {
//Program: How to get least value element from a set?
	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(6);
		set.add(3);
		set.add(9);
		System.out.println(set);
		System.out.println("Low value  : "+set.first());
		System.out.println("High value : "+set.last());
	}
}
