package ArrayListImportant;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListToArrayCopy {
//How to copy ArrayList to array?
	public static void main(String[] args) {
		ArrayList<String> v = new ArrayList<String>();
		v.add("Zero");
		v.add("first");
		v.add("second");
		v.add("Third");
		v.add("fourth");
		v.add("fifth");
		System.out.println("Actual ArrayList:" + v);
		String s[] = new String[v.size()];
		v.toArray(s);
		   System.out.println("Created Array content:");
		for (String str : s) {
			System.out.println(str);
		}
	}
}

//Here we can see example for copying all content of ArrayList to an array.
//You can get this done by calling toArray() method.