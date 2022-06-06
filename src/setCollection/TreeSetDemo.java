package setCollection;

import java.util.Iterator;
import java.util.TreeSet;

// No duplicate values
// Insertion in Sorting order ASC order

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(25);
		ts.add(16);
		ts.add(10);
		ts.add(8);
		
     //	System.out.println(ts);    // 	[10, 16, 20, 25]
	//	Iterator it = ts.descendingIterator();    // prints in desecending order
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());    // 10,16,20,26
		}
		System.out.println("---------------------------");
		System.out.println(ts.first());  // 10
		System.out.println(ts.last());   // 26
		
	//	TreeSet ts1 = (TreeSet) ts.headSet(16);   // by using this we can get value lessthan 10 given in ()
	//	System.out.println(ts1);
		
	//	TreeSet  ts1 = (TreeSet) ts.tailSet(16);
	//	System.out.println(ts1);
	
		TreeSet ts1 = (TreeSet) ts.subSet(11, 24);
		System.out.println(ts1);
		// it will prints values between range
		
	}

}

// summary
//               HashSet     LinkedHashSet      TreeSet
// order        unordered      order             sort
// duplicates      no           no                no
// Synchronized    no           no                no
// Sorting                                        yes(Asc)
// DataStructure   HashTable    HashTable+         BalancedTree
//                              DoubleLinkedList
// Capacity        16             16              -------
//