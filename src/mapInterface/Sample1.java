package mapInterface;

import java.util.HashMap;

public class Sample1 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Sridhar");
		hm.put(2,"Vishnu");
		System.out.println(hm);
		//System.out.println(hm.containsKey(1));
		//System.out.println(hm.containsValue("Vishnu"));
		System.out.println(hm.get(1));
	}
}
