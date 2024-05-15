package university.courses;

public class Course {
	String courseName;
	long courseId;
	long departmentId;

	public Course() {

	}

	public Course(String courseName, long courseId, long departmentId) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.departmentId = departmentId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + ", departmentId=" + departmentId + "]";
	}

}
