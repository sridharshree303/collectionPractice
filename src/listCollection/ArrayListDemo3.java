package listCollection;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	int rollno;
	String name,address;
	Student(int rollno,String name,String address){
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		
		Student s1 = new Student(1, "Sridhar", "Nellore");
		Student s2 = new Student(2, "Vishnu", "Chennai");
		Student s3 = new Student(3, "Teja", "Venkatagiri");
		Student s4 = new Student(4, "Sohan", "vgr");
		
		List<Student> list1 = new ArrayList<>(); // accepts only student type values
		// now adding objects to add list
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		
		for(Student s : list1)
			System.out.println(s.toString());
//			System.out.println(s.name); //only names
//		    System.out.print(s.rollno+" "+s.name+" "+s.address+"\n");
		
		
	}	
}
