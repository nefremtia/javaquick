package javaquick.newtech;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class JavaCollections {
	public static void main(String args[]) {

		// Hashset for unique numbers
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(15);
		hs.add(18);
		hs.add(18);
		System.out.print(hs.toString());
		if (hs.contains(15)) {
			System.out.println("yes");
		} else {
			System.out.println("false");
		}

		//Can have null values and key- asynch, better performance
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0, "Martial");
		hm.put(1, "Fellini");
		hm.put(2, null);
		System.out.println(hm.toString());
		
		//Null value not accepted, Synchronized- only one thread at a time 
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(0, "Portugal");
		ht.put(1, null);
		System.out.println(ht.toString());

	}

}
