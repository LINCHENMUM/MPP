package lab6;

import java.util.ArrayList;

public class Student extends Person {
	private double GPA;
	private ArrayList<Course> courses;
	
	Student(String name, String phone, int age, double GPA) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.GPA = GPA;
		this.courses = new ArrayList<Course>();
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public int getTotalUnits() {
		int units = 0;
		for(Course c : courses) {
			units += c.getUnits();
		}
		return units;
	}
}
