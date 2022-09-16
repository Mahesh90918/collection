package Vector;

import java.util.List;
import java.util.Vector;

public class SubListVector {
public static void main(String[] args) {
	Vector<String> v = new Vector<String>();
	v.add("Zero");
	v.add("first");
	v.add("second");
	v.add("Third");
	v.add("fourth");
	v.add("fifth");
	System.out.println(v);
	List sub=v.subList(2, 4);// using list
	System.out.println(sub);
}
}
