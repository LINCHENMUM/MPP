package Prob2A;

public class GradeReport {
	private Student student;
	public GradeReport(){
		//this.student=new Student();
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String toString() {
		return "Student grade report";
	}
}
