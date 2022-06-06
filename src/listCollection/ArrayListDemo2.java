package listCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(50);
		list2.add(70);
		list2.add(30);
		list2.add(80);
		list2.addAll(list1);
		System.out.println(list2);       // add all method
		System.out.println("------------------------");
		System.out.println( list2.remove(5));                 // Remove method
		System.out.println(list2);
		
		System.out.println(list2.get(3));    // By tracking Index for Value
		System.out.println(list2);
		System.out.println("------------------------------------");
		List<Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(10);
		list3.add(2,34);
//		list3.remove();
		System.out.println(list3);
		
		System.out.println("---------------------------");
		System.out.println(list3);
//		list3.clear();    // it will clears all the data in list
		System.out.println(list3.get(3));
		System.out.println(list3.lastIndexOf(40));  // prints the index value at last value among all duplicate values
	    System.out.println(list3.get(list3.lastIndexOf(40)));
        System.out.println(list3.contains(40));      // it will results the true or false if exits in list
        //------------------------------------------------------------
        System.out.println("------------------------");
        //replacing the the value in list
        list3.set(4, 55);
        System.out.println(list3);
        System.out.println("------------------------");
        //sorting the order
        
        list3.sort(null);
        System.out.println(list3);
        System.out.println(list3.subList(2, 4));    // elements separate from list (sublist)
        
        
	}

}
