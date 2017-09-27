package DepartmentComputer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department {
	private String name;
	private List<Person> AllPersons;

	public Department(String name) {
		this.name = name;
		this.AllPersons = new ArrayList<Person>();
	}

	public List<Person> getAllPersons() {
		return AllPersons;
	}

	public List<Person> addPerson(Person p){
		AllPersons.add(p);
		return AllPersons;
	}
    
	public void getStartDateCourse(){
		for (Person p:AllPersons){
			if (p instanceof StaffStudent){
				System.out.println(p.name +" start to take the first course date is "+((StaffStudent) p).getStartCourse());
			}
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public double getTotalSalary() {
      double totalSalary=0;
      for (Object p:AllPersons){
    	  if(p instanceof Faculty){
    		  totalSalary+=((Faculty) p).getSalary();
    	  }else if (p instanceof Staff){
    		  totalSalary+=((Staff) p).getSalary();
    	  }else if (p instanceof StaffStudent){
    		  totalSalary+=((StaffStudent) p).getSalary();
    	  }
      }
		return totalSalary;
	}

	public void showAllMembers() {
		for (Object p:AllPersons){
			System.out.println(p);
		}
	}

	public void unitsPerFaculty() {
		for (Object p:AllPersons){
			if (p instanceof Faculty){
				System.out.println(((Faculty)p).name +" has "+((Faculty)p).getTotalUnits() );
			}
		}
	}
	public void studentsPerFaculty(){
		for (Object p:AllPersons){
			if (p instanceof Faculty){
				System.out.println("Faculty "+((Faculty)p).name +" has course:");
				List<Course> courses=((Faculty) p).getAllCourses();
				Iterator<Course> iterator=courses.iterator();
				Course course;
				Person student;
				
				while(iterator.hasNext()){
					course=iterator.next();
					System.out.println("Course "+course.getTitle()+" has students:");
					List<Person> students=course.getStudents();
					Iterator<Person> iteratorSt=students.iterator();
					while(iteratorSt.hasNext()){
						student=iteratorSt.next();
						System.out.println(student.name);
					}
					System.out.println("....................");
				}
			}
			//System.out.println("....................................");
		}
	}

	public String toString() {
		return "Department is " + name;
	}
}
