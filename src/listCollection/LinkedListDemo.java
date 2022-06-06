package listCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Student1> l1 = new LinkedList<>();
		
		LinkedList<Integer> lst = new LinkedList<>();
		lst.add(201);
		lst.add(1, 202);
		lst.addFirst(200);
		lst.addLast(203);
		lst.getFirst();
		
		System.out.println(lst);
		
	    Student1 s1 = new Student1(20);  //two methods
		l1.add(s1);
		l1.add(new Student1(25));
		
		System.out.println(l1);
		
		ListIterator<Student1> it = l1.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
		Iterator itt = lst.iterator();
		while(itt.hasNext()) {
		System.out.println(itt.next());
		}
	}
	
}

class Student1{
	int rollno;
	public Student1(int rollno) {
		this.rollno = rollno;
	}
	public String toString() {
		return ""+rollno;
	}
}
//Student class from previous package 
/*
add()
add(index,element)    // ArrayList works on index value
addFirst()
addLast()
clear()
get()
getFirst()
getLast()
remove()
removeFirst()
removeLast()
size()

*/