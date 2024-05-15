package university.faculty;

public abstract class Faculty {

	long id;
	String name;
	
	public Faculty(long id,String name) {
		this.id = id;
		this.name = name;
	}

	abstract void showDetails();

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return "Faculty [id=" + id + ", name=" + name + "]";
	}

}
