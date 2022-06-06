package listCollection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

//		Vector v = new Vector();
//		System.out.println(v.capacity());   //10  
//		v.add("Sridhar");
//		v.add("Vishnu");
//		v.add("Chandhu");
//		System.out.println(v);
//		System.out.println(v.capacity());   //10
//		// for vector capacity is 10 default                    
//		// and every time it will get double 10,20,40,etc

		// collections topic added 1.2 version

		Vector v = new Vector(5, 30); // 30 is the capacity
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(1);
		v.add(2);
		v.add(3);
		Vector v1 = new Vector(2,36);
		v1.add(2);
		v1.add(3);
		v1.addAll(v);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println("--------------------------");
		System.out.println(v);
		System.out.println(v.capacity()); // it shows capacity
		System.out.println(v.size()); // it shows current size
		v.clear();
		// differences b/w arraylist and vector
		// ArrayList - not synchronized - no thread safe -- multiple threads can excess
		// the thread
		// Synchronized only one thread -- at a time one thread can connect
		// ArrayList capacity - every time 50% increases
		// Vector capacity - every time increases 100% or double
		// Vector is used for fixed size collection . if u want only 50 elements in
		// collection we can use that

	}

}
