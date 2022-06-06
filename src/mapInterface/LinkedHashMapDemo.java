package mapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	//Insertion order is followed
	//Non-synchronized
	//duplicate values, no duplicate keys
	//exact order like list
	public static void main(String[] args) {
		LinkedHashMap lnm = new LinkedHashMap();
		lnm.put("Kolluru", "Sridhar");
		lnm.put("Vishnu","Kolluru");
		lnm.put("Sri","Chandhu");
		//follows insertion order
		Set s = lnm.keySet();
		
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String str = (String)obj;
			System.out.println(str+" "+lnm.get(str));
		}
		
		//exactly printed as list and in a order
		

	}

}
