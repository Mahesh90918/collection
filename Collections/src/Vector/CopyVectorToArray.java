package Vector;

import java.util.Vector;

public class CopyVectorToArray {
	// How to copy vector to array?
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Zero");
		v.add("first");
		v.add("second");
		v.add("Third");
		v.add("fourth");
		v.add("fifth");
		System.out.println(v);
		String[] copyArr = new String[v.size()];
		v.copyInto(copyArr);
		System.out.println("Copied Array content:");
		for (String str : copyArr) {
			System.out.println(str);
		}
	}
}
