package DepartmentComputer;

public class Staff extends Person{
private double salary;

public Staff(String name, String phone, int age,double salary){
	this.name=name;
	this.phone=phone;
	this.age=age;
	this.salary=salary;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
public String toString(){
	return "Name is "+name+"  Phone number is "+phone +" Age is "+age+" member type is Staff";
}
}
