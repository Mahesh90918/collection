package ArrayList;

import java.util.ArrayList;

public class AutoBoxArrayList {
public static void main(String[] args) {
	ArrayList al= new ArrayList();
	Integer i= new Integer(10);
	Double d= new Double(10.25);
	Character ch= new Character('M');
	
	al.add(i);
	al.add(d);
	al.add(ch);
	System.out.println(al);
	ArrayList al1= new ArrayList();
	al1.add(10);// AutoBoxing
	al1.add(Integer.valueOf(10));// internally converting like that
	al1.add(String.valueOf(10));// String converts Int
	System.out.println(al1);
	
}
}
