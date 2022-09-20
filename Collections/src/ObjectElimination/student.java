package ObjectElimination;

public class student {
	int id;
	String name;

	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
// own implementation
//	@Override
//	public int hashCode() {
//		return id + name.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		student s = (student) obj;
//		return s.name.equals(this.name) ;
//	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

}
