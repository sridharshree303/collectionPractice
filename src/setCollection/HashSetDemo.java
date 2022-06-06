package setCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

//
//-- set is an interface
//-- unordered
//-- HashSet , Linked HashSet , TreeSet  classes
//-- List(Ordered) , Set(Unordered) Insertion order
//-- Duplicate values not allowed - unique values allowed
//-- No index portion in set interface
//-- 

// set interface Implementation Hashset
// Non-synchronized (not thread safe)
// hashtable will generates hash code to store values 
// search operations can perform will be useful
// initial capacity is 16
// every time it will be doubled
// lead factor  -  we can choose when the capacity needs to increase like 25,50,75%
//
// operations - add,remove,contains,isEmpty,size,clear
//


public class HashSetDemo {

	public static void main(String[] args) {
		// it will print values unordered/random based on hashcode
		// duplicate values are deleted automatically and shows only one value
		HashSet<String> hs = new HashSet<>();
		hs.add("Abhishek");
		hs.add("Vasantha");
		hs.add("Ganesha");
		hs.add("Manasa");
		hs.add("Vasantha");
		
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		//	System.out.println("----------------------------");
		}	
		System.out.println("----------------------------");
		System.out.println("----------------------------");
//		hs.forEach(a->{
//			System.out.println(a);
//		});
		LinkedHashSet<String> hs1 = new LinkedHashSet<>();
		hs1.add("Abhishek");
		hs1.add("Vasantha");
		hs1.add("Ganesha");
		hs1.add("Manasa");
		hs1.add("Vasantha");
		//System.out.println(hs1);
		hs1.forEach(a1->{
			System.out.println(a1);
		});

	}

}
