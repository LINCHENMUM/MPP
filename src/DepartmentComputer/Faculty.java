package DepartmentComputer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Faculty extends Person{
private double salary;
private List<Course> allCourses;


public Faculty(String name, String phone, int age,double salary){
	this.name=name;
	this.phone=phone;
	this.age=age;
	this.salary=salary; 
	allCourses = new ArrayList<Course>();
}

public void addCourse(Course course){
	allCourses.add(course);
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getTotalUnits(){
	int totalUnits=0;
	for (Object c:allCourses){
		if (c instanceof Course)
			totalUnits+=((Course) c).getUnits();
	}
	return totalUnits;
}
public List<Person> getStudentList(){
	List<Person> allStudents=new ArrayList<Person>();
	for (Course c:allCourses){
	   allStudents.addAll(c.getStudents());
	}
	return allStudents;
}

public List<Course> getAllCourses() {
	return allCourses;
}

public String toString(){
	return "Name is "+name+"  Phone number is "+phone +" Age is "+age+" member type is Faculty";
}
}
