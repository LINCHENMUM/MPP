package Prob2C;

import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	Student st1=new Student("Lin1");
	Student st2=new Student("Lin2");
	Section section1=new Section("Section num1");
	Section section2=new Section("Section num2");
	Section section3=new Section("Section num3");
	st1.getAllSection().add(section1);
	st1.getAllSection().add(section2);
	st2.getAllSection().add(section3);
	
	section1.getAllStudents().add(st1);
	section1.getAllStudents().add(st2);
	
	System.out.println(st1+" of Section..............");
	Iterator<Section> iteratorSe=st1.getAllSection().iterator();
	while (iteratorSe.hasNext()) {
		System.out.println(iteratorSe.next());
	}
	
	System.out.println(section1+" of Student..............");
	Iterator<Student> iteratorST=section1.getAllStudents().iterator();
	while (iteratorST.hasNext()) {
		System.out.println(iteratorST.next());
	}
}
}
