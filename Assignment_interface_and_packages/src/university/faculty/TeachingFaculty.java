package university.faculty;

public class TeachingFaculty extends Faculty {

	long deparmentId;

	public TeachingFaculty(long id, String name, long departmentId) {
		super(id, name);
		this.deparmentId = departmentId;
	}

	@Override
	void showDetails() {
		System.out.println("Id:" + this.id + " Name:" + this.name + " Department Id:" + this.deparmentId);
	}

	@Override
	public String toString() {
		return "TeachingFaculty [deparmentId=" + deparmentId + ", id=" + id + ", name=" + name + "]";
	}



}
