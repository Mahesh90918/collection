package ArrayList;

import java.util.ArrayList;

public class example2 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("mahesh");
	al.add("sriman");
	al.add("shan");
	al.add(100);
	al.add(true);
	System.out.println(al);
	al.add(0, "unukuru");
	System.out.println(al);
	al.remove("unukuru");
	al.remove(0);
	System.out.println(al);
	
}
}
