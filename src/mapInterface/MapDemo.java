package mapInterface;

//in java guides
// set<Map.Entry<String,Integer>> entries = hm.entrySet();
//Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
// while(iterator.hasnext()){
// Sop();  
//}
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//MapDemo
// key   -------  value
// (unique)       (duplicate)
// 101    ----     abhi
// 102    ----     suresh
// 103    ----     abhi
// Insertion order not  (X)
// Key+value  ->> Entry   we storing both key+value

public class MapDemo {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2, "Sridhar");
		hm.put(1, "Vishnu");
		hm.put(3, "Chandhu");
		 System.out.println(hm);

		/*
		 * hm.remove(3); // it will deletes the value by using key
		 * System.out.println(hm.get(2)); System.out.println(hm.size());
		 * System.out.println(hm.isEmpty());
		 */

		// KeySet Method -- we can result all keys in collection
		Set<Integer> s = hm.keySet();
		System.out.println(s);
		// keySet method is method store keys only
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			//String str = (String) obj;
			System.out.println(obj + " " + hm.get(obj));
		}

	}

}
