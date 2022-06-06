package mapInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	
		TreeMap tm = new TreeMap();
		tm.put("Kolluru", "Sridhar");
		tm.put("Vishnu","Kolluru");
		tm.put("Sri","Chandhu");
		
		// not synchronised and follows sort order based on key
		// default size is 16 
		
        Set s = tm.keySet();
		
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
//			String str = (String)obj;
			System.out.println(obj+" "+tm.get(obj));
		}

		// printed in a sorted order
	}

}
