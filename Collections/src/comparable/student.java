package comparable;

public class student implements Comparable<student> {
	int id;
	String name;

	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(student o) {
		return this.name.compareTo(o.name);
	}
//	@Override
//	public int compareTo(student o) {
//		return this.id-o.id;
//	}

}
