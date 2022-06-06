package listCollection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println(v.capacity());
		System.out.println(v.size());
		for(int i = 10;i<100;i++)
			v.add(new Integer(i));

		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(110);

		System.out.println(v.capacity());
		System.out.println(v.size());
		
		Enumeration e = v.elements();
		System.out.println("Vector elements are : ");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
