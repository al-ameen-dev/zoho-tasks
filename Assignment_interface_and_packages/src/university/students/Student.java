package university.students;

import java.util.ArrayList;
import java.util.List;

import university.courses.Course;

public class Student {
	private String name;
	private int id;
	private List<Course> courses;

	public Student(String name, int studentId) {
		this.name = name;
		this.id = studentId;
		this.courses = new ArrayList<>();
	}

	public void enrollCourse(Course course) {
		courses.add(course);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return id;
	}

	public void setStudentId(int studentId) {
		this.id = studentId;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", courses=" + courses + "]";
	}

}
