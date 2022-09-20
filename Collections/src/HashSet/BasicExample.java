package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class BasicExample {
	// insertion order not preserved
	// duplicates not allowed
	// null one time allowed
public static void main(String[] args) {
	HashSet<String> set=new HashSet<String>();
	set.add("Zero");
	set.add("First");
	set.add("Second");
	set.add("Third");
	set.add("Fourth");
	set.add("Fifth");
	//set.add("Fifth");
	set.add(null);
	//set.add(null);
	System.out.println(set);
	System.out.println(set.size());
	System.out.println(set.isEmpty());
	set.remove("Fifth");
	System.out.println(set);
	System.out.println(set.contains("Zero"));
	System.out.println("....................");
	Iterator i= set.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}
