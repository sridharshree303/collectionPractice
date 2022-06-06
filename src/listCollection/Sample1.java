package listCollection;

//List(duplicate ,ordered) LinkedList and ArrayList
//Set(unique,unordered) Hashset,Treetset and LinkedHashSet
//Queue(FIFO) PriorityQueue
//Deque(FIFO & LIFO)
//Map(uniqueKeys,duplicate data) HashMap,LinkedHashMap,Treemap

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sample1 {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();
		lst.add(100);
		// lst.add("Sridhar");
		lst.add((int) 99.99);
		lst.add(55);
		lst.add(15);
		System.out.println(lst);

		System.out.println("\nForLoop");
		for (int list : lst) {
			System.out.println(list);
		}
		System.out.println("\nUsing Iterator in forward asc");
		ListIterator<Integer> it = lst.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\nUsing Iterator in reverse desc");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}

		System.out.println("\nSome fumctions");
		System.out.println(lst.size());

		// System.out.println(lst.remove((int)2));
		System.out.println("\nFor each Method");
		lst.forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("\nFor each remaining method");
		Iterator<Integer> itr = lst.iterator();
		itr.forEachRemaining(b->{
			System.out.println(b);
		});
		
		//add between in index
		System.out.println("\nadd in between");
		lst.add(2, 27);
		System.out.println();
		
		System.out.println("\nadd two lists");
		List<Integer> lst2 = new ArrayList<>();
		lst2.add(51);
		lst2.add(45);
		lst2.add(35);
		lst2.addAll(lst);
		System.out.println(lst2);
//		lst2.addAll(2,lst);
		
		//equals method
		System.out.println("\n equals method");
		System.out.println(lst2.equals(lst));
		
		//isEmpty method
		System.out.println("\nIs empty method");
		List<Integer> lst3 = new ArrayList<>();
		System.out.println(lst3.isEmpty());
		
		//Indexof 
		System.out.println("\n methods");
		System.out.println(lst2.lastIndexOf(35));
		System.out.println(lst2.indexOf(55));
		System.out.println(lst2.contains(45));  //boolean
		
		//remove
		System.out.println(lst2);
		lst2.remove(5);
		System.out.println(lst2);
		
		//set method to update value
		System.out.println("Set method");
		lst2.set(5, 27);
		System.out.println(lst2);
		
		//CASE_INSENSITIVE_ORDER
		//Sublist
		System.out.println("\nSublist method");
		System.out.println(lst2.subList(2, 5));
		

	}

}




