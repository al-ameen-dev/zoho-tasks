package university;

import university.courses.Course;
import university.faculty.Faculty;
import university.faculty.TeachingFaculty;
import university.students.Student;

/*
Design a university management system with packages. Create packages like university.students , university.courses , and university.faculty .
Implement classes within these packages to represent students, courses, and faculty members.
Utilize packages to structure the code based on the functionality.
 */
public class Main {
	public static void main(String[] args) {
		Faculty teachingFaculty = new TeachingFaculty(1, "al ameen", 4);
		Course course = new Course("CSE", 3, 5);
		Student student = new Student("mark zucker", 2);
		System.out.println(teachingFaculty);
		System.out.println(course);
		System.out.println(student);

	}
}
