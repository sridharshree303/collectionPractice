package listCollection;
//

//list have these features
//
//- Allows null values
//- Allows duplicate values
//- ordered wise values
//- arraylist and linkedlist are not thread safe
//- vector and stack are thread safe
//- resizable array -> arraylist,vector,stack
//LIFO

import java.util.Stack;
import java.util.ArrayList;

public class StackDemo {

	public static void main(String[] args) {

		// follows LIFO - LAST IN FIRST OUT
		// -> Last inserted value deleted first

//		push()  --  INSERT
//		pop()   --  REMOVE
//		empty() --  
//		peek()  --  HIGHER VALUE ON STACK
//		search() --  SEARCHING

		Stack<Integer> s = new Stack<>();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);

		System.out.println(s); // [5, 4, 3, 2, 1]  

		s.pop();   // 1 is deleted because 

		System.out.println(s); // [5, 4, 3, 2]

		System.out.println(s.peek()); // 2

		System.out.println(s.empty()); // false because the stack has values

		System.out.println(s.search(3)); // 2      // if results 1 or -1
		
		ArrayList <String> al = new ArrayList<>();
       	
		al.add("Naresh");
       	al.add("Suresh");
       	
  	    System.out.println(al);	
  	    
       	String s1 = al.get(1);// type casting is not required
       	System.out.println(s1);


	}

}

// List topics
