package lab6;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.imageio.ImageTypeSpecifier;

import javafx.print.PageRange;

public class Department {
	private String name;
	ArrayList<Person> persons;

	Department(String name) {
		this.name = name;
		this.persons = new ArrayList<Person>();
	}
	
	public void addPerson(Person p) {
		persons.add(p);
	}
	
	public double getTotalSalary() {
		double salary = 0;
		salary=persons.stream()
				      .reduce((sunm,salary)->sum+salary)
				      
		       
		
		

	}
	
	public void showAllMembers() {
		String strPattern = "Name:%s, Phone number:%s, Age:%d, Type:%s";
		for(Person p : persons) {
			String str = String.format(strPattern, p.name,p.phone,p.age,p.getClass().getSimpleName());
			System.out.println(str);
		}
	}
	
	public void unitsPerFaculty() {
		int units = 0;
		int totalUnits = 0;
		for(Person p: persons) {
			if(p instanceof Faculty) {
				Faculty faculty = (Faculty)p;
				units = faculty.getTotalUnits();
				totalUnits += units;
				System.out.println("Faculty Name:" + faculty.name);
				System.out.println("Units that teach:" + units);
			}
		}
		System.out.println("Total units that they teach:" + totalUnits);
	}
	
	public void printStudentNames(String facultyName) {
		ArrayList<Course> facultyCourses = null;
		for(Person p: persons) {
			if(p instanceof Faculty) {
				Faculty faculty = (Faculty)p;
				if(faculty.name.equals(facultyName)) {
					facultyCourses = faculty.getCourses();
				}
			}
			
			String strTempStudent = "";
			if(p instanceof Student) {
				Student student = (Student)p;
				ArrayList<Course> studentCourses = student.getCourses();
				if(facultyCourses != null) {
					for(int i=0;i<facultyCourses.size();i++) {
						for(int j=0;j<studentCourses.size();j++) {
							if(studentCourses.get(j).equals(facultyCourses.get(i))) {
								if(!strTempStudent.equals(student.name)) {
									System.out.println("Student Name:" +student.name);
									strTempStudent = student.name;
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
