package Prob2A;

public class Main {
public static void main(String[] agrs){
	Student student=new Student("Lin Chen");
	GradeReport gradeReport=new GradeReport();
	System.out.println(student.getGradeReport());
	System.out.println(gradeReport.getStudent());
}
}
