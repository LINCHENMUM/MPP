package Prob2C;

import java.util.ArrayList;
import java.util.List;

public class Section {
public String sectionNum;
private List<Student> allStudents;

public String getSectionNum() {
	return sectionNum;
}
public void setSectionNum(String sectionNum) {
	this.sectionNum = sectionNum;
}
public List<Student> getAllStudents() {
	return allStudents;
}

public Section(){
	this.allStudents=new ArrayList<Student>();
}
public Section (String sectionNum) {
	this();
	this.sectionNum=sectionNum;
}
	public String toString(){
		return "Section number="+this.sectionNum;
	}
}
