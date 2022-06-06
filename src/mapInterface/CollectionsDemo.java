package mapInterface;

import java.util.ArrayList;
import java.util.Collections;

//Collection Static Methods :
//-->  1.Sort method
//

public class CollectionsDemo {

	public static void main(String[] args) {
		
	ArrayList list = new ArrayList();
	list.add(65);
	list.add(54);
	list.add(67);
	list.add(47);
	list.add(53);
	
	System.out.println("listed as per order");
	System.out.println(list);  // listed as per order
	
	System.out.println("sorted in asc");
	Collections.sort(list);     
	System.out.println(list);   // sorted in asc
	
	System.out.println("Reverse order :");
	Collections.reverse(list);
	System.out.println(list);
	
	System.out.println("Swap order :");
	Collections.swap(list, 1, 3);
	System.out.println(list);
	
	
	System.out.println("Minimum order");
	System.out.println(Collections.min(list));
	System.out.println("Maximum order");
	System.out.println(Collections.max(list));
	}

}

   