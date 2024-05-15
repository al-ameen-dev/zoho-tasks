package university.faculty;

public class NonTeachingFaculty extends Faculty {

	int workingHours;

	public NonTeachingFaculty(long id, String name) {
		super(id, name);

	}

	@Override
	void showDetails() {
		System.out.println("Id:" + this.id + " Name:" + this.name + " Working Hours:" + this.workingHours);
	}

}
