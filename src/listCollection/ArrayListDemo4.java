package listCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {

	List <Student2> list = new ArrayList<>();
	Student2 s1 = new Student2(101,"Sridhar","Kolluru");
	Student2 s2 = new Student2(102,"Vishnu","Kolluru");
	Student2 s3 = new Student2(103,"Chandhu","Kolluru");
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	
	for(Student2 s : list) 
		System.out.println(s.first_name+" "+s.Last_Name+"  "+s.rollno);	
	
	ArrayList <String> lst = new ArrayList<>();
	lst.add(new String("Seetha"));
	lst.add(new String("Ram"));
	System.out.println(lst);
	
	ArrayList<Integer> a1 = new ArrayList<>();
	System.out.println(a1.size());
	a1.add(10);
	a1.add(new Integer(15));
	a1.add(20);
	System.out.println(a1);
	System.out.println(a1.size());
	a1.remove(1);
	System.out.println(a1);
	System.out.println(a1.get(1));
	}
}

class Student2{
	int rollno;
	String first_name,Last_Name;
	public Student2(int rollno,String first_name,String Last_name){
		this.rollno = rollno;
		this.first_name = first_name;
		this.Last_Name = Last_name;
	}
}
