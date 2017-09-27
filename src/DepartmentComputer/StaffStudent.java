package DepartmentComputer;

import java.util.*;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class StaffStudent extends Person {
   private double salary;
   private double GPA;
   private Date startCourse;
   private List<Course> allCourses;
   
   public StaffStudent(String name, String phone,int age,double salary,double GPA,Date startCourse){
	   this.name=name;
	   this.phone=phone;
	   this.age=age;
	   this.salary=salary;
	   this.GPA=GPA;
	   this.startCourse=startCourse;
	   allCourses=new ArrayList<Course>();
   }

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public double getGPA() {
	return GPA;
}

public void setGPA(double gPA) {
	GPA = gPA;
}
   
public Date getStartCourse() {
	return startCourse;
}

public void setStartCourse(Date startCourse) {
	this.startCourse = startCourse;
}

public List<Course> addCourse(Course course){
	allCourses.add(course);
	return allCourses;
}

public String toString(){
	return "Name is "+name+"  Phone number is "+phone +" Age is "+age+" member type is StaffStudent";
}
}
