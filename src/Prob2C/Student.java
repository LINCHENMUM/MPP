package Prob2C;

import java.util.*;

public class Student {
	public String name;
    private List<Section> allSection;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Section> getAllSection() {
		return allSection;
	}
	public Student() {
		this.allSection=new ArrayList<Section>();
	}
	public Student(String name) {
		this();
		this.name=name;
	}
	public String toString() {
		return "Student name:"+this.name;
	}
    
}
