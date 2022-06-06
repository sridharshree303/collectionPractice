package listCollection;

import java.util.ArrayList;
import java.util.List;

class Student10{
	int rollno;
	String name;
	
	Student10(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	@Override
	public String toString() {   //  we use tostring method to convert adress to string value
		
		return rollno+" "+name;
	}
	
}

public class Sample2 {

	public static void main(String[] args) {
		List<Student10> list = new ArrayList<>();
		
		Student10 s1 = new Student10(101,"Srdihar");
		Student10 s2 = new Student10(102,"Vishnu");
		Student10 s3 = new Student10(103,"Teja");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(new Student10(104,"Chandhu"));
		
//		for(Student10 s : list) {
//			System.out.println(s.rollno+" "+s.name);
//		}
		
		list.forEach(a->{
			System.out.println(a);
		});

		//System.out.println(list);
	}

}
