package Vector;

import java.util.Vector;

public class Clonevect2 {
	// How to copy or clone a vector?
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("Zero");
		v.add("first");
		v.add("second");
		v.add("third");
		v.add("fourth");
		v.add("fifth");
		System.out.println("original copy  :"+v);
		Vector copy=(Vector) v.clone();
		System.out.println("cloned copy    :"+copy);
		
		Vector<String> v1 = new Vector<String>();
		v1.add("Zero");
		v1.add("first");
		v1.add("second");
		v1.add("third");
		v1.add("fourth");
		v1.add("fifth");
		System.out.println("original copy  :"+v1);
		Vector<String> copy1=(Vector<String>) v1.clone();
		System.out.println("cloned copy    :"+copy1);
	}
}
