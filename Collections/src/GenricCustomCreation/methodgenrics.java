package GenricCustomCreation;

public class methodgenrics {

	public static <mahesh> void getprint(mahesh[] obj) {
		for (mahesh ele : obj) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}
	
}