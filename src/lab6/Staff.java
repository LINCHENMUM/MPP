package lab6;

public class Staff extends Person {
	private double salary;
	
	Staff(String name, String phone, int age, double salary) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
}
