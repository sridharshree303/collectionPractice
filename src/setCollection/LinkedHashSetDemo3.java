package setCollection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo3 {

	public static void main(String[] args) {
		
		// LinkedHashSet of String Type
       	LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
 
       	// Adding elements to the LinkedHashSet
       	lhs1.add("A");
       	lhs1.add("B");
       	lhs1.add("C");
       	lhs1.add("D");
       	System.out.println(lhs1);
 
       	// LinkedHashSet of Integer Type
     LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();
 
       	// Adding elements
       	lhs2.add(10);
       	lhs2.add(20);
       	lhs2.add(30);
       	lhs2.add(40);
       	System.out.println(lhs2);


	}

}
