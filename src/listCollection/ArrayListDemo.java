package listCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<>();        //Generic  - we can store particular data 

		a1.add("Abishek");
		// a1.add(100);
		a1.add("Sridhar");
		// a1.add(10.5);
		a1.add(null);
		a1.add("Vishnu");
		a1.add(new String("Sri"));
		
		for(String s : a1)
			System.out.println(s);
		System.out.println("------------------------------------");
		
		for(int i = 0; i<a1.size(); i++)
			System.out.println(a1.get(i));      // prints index value
		System.out.println("------------------------------------");

		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(2));
		System.out.println("------------------------------------");
		
		//operations
		ListIterator<String> itr = a1.listIterator();      // we can print back to front and front to back
		System.out.println("In forward Direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());                // in forward direction
		}
		System.out.println("------------------------------------");
		
		System.out.println("In Reverse Direction");        // in backward direction(Reverse)
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println("------------------------------------");
		
		System.out.println("Using Lamda Expressions");
		// we can use forEachRemaining instead of forEach
		a1.forEach(a->{
			System.out.println(a);
		});
		

	}

}
