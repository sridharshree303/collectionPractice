package setCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

// No duplicate values
// No insertion order - 

// LinkedHashSet 
// duplicate values allowed
// Insertion order is correct

// TreeSet 
// Duplicate order not allowed
// Insertion is sorting(asc order)

public class SetDemo {

	public static void main(String[] args) {
		// HashSet -- hashtables
		// LinkedHashset -- hashtables + Linkedlist

		LinkedHashSet ls = new LinkedHashSet<>();

		ls.add(10);
		ls.add(5);
		ls.add(24);
		ls.add(15);
		ls.add(10);   // if  u added also it will results only once ... no duplicates values
		// output is same no random
		Iterator it = ls.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
