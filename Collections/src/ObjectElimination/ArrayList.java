package ObjectElimination;

public class ArrayList {
	public static void main(String[] args) {
		// duplicates cre allowed in ArrayList
		// even equal and hascodes are overiden also
		// that's why we go sets 
		java.util.ArrayList<student> lk = new java.util.ArrayList<>();
		student s1 = new student(01, "mahesh");
		student s2 = new student(02, "shan");
		student s3 = new student(03, "sriman");
		student s4 = new student(01, "mahesh");
		student s5 = new student(03, "sriman");
		lk.add(s1);
		lk.add(s2);
		lk.add(s3);
		lk.add(s4);
		lk.add(s5);

		System.out.println(lk);
		for (student student : lk) {
			System.out.println(student);
		}
	}
}
