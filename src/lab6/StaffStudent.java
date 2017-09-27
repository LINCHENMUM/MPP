package lab6;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class StaffStudent extends Person {
	private double salary;
	private double GPA;
	private GregorianCalendar firstCourseTakenStartDate;
	private ArrayList<Course> courses;
	
	StaffStudent(String name, String phone, int age, double salary, double GPA, GregorianCalendar firstCourseTakenStartDate) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
		this.GPA = GPA;
		this.firstCourseTakenStartDate = firstCourseTakenStartDate;
		this.courses = new ArrayList<Course>();
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
}
