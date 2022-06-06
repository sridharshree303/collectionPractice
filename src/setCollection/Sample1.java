package setCollection;

import java.util.HashSet;
import java.util.Random;

public class Sample1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		Random r = new Random();
		
		for(int i = 0;i<50;i++) {
			int num = r.nextInt(20);
			hs.add(num);
		}	
			System.out.println(hs);

	}

}
