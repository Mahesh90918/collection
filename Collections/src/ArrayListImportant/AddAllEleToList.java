package ArrayListImportant;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class AddAllEleToList {
	// How to add all elements of a list to ArrayList
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Zero");
		v.add("first");
		v.add("second");
		v.add("Third");
		v.add("fourth");
		v.add("fifth");
		 System.out.println("Actual ArrayList:"+v);
		List list= new ArrayList();
		list.add(1);
		list.add(2);
		list.add("one");
		list.add("two");
		v.addAll(list);
		System.out.println("After adding List Elements :"+v);
}
}