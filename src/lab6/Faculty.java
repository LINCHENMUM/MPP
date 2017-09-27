package lab6;

import java.util.ArrayList;

public class Faculty extends Person {
	private double salary;
	private ArrayList<Course> courses;
	
	Faculty(String name, String phone, int age, double salary) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
		this.courses = new ArrayList<Course>();
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getTotalUnits() {
		int units = 0;
		for(Course c : courses) {
			units += c.getUnits();
		}
		return units;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}
	
}
