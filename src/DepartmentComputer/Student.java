package DepartmentComputer;

import java.util.*;

public class Student extends Person {
private double GPA;
private List<Course> allCourses;

public Student(String name, String phone, int age,double GPA){
	this.name=name;
	this.phone=phone;
	this.age=age;
	this.GPA=GPA;
	allCourses=new ArrayList<Course>();
}

public void addCourse(Course course){
	allCourses.add(course);
}

public double getGPA() {
	return GPA;
}

public void setGPA(double gPA) {
	GPA = gPA;
}

public int getTotalUnits(){
	return 0;
}

public String toString(){
	return "Name is "+name+"  Phone number is "+phone +" Age is "+age+" member type is Student";
}
}
