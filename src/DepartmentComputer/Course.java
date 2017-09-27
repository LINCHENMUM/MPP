package DepartmentComputer;

import java.util.*;

public class Course {
private String number;
private String title;
private int units;
private Faculty faculty;
private List<Person> students;

public Course(String number, String title, int units, Faculty faculty){
	this.number=number;
	this.title=number;
	this.units=units;
	this.faculty=faculty;
	students=new ArrayList<Person>();
}

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getUnits() {
	return units;
}
//public void setUnits(int units) {
//	units = units;
//}
public List<Person> addStudent(Person student){
	students.add(student);
	return students;
}

public List<Person> getStudents() {
	return students;
}
}
