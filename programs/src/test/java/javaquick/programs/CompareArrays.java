package javaquick.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareArrays {

	public static void main(String args[]) {
		List<Integer> array1 = Arrays.asList(15, 90, 16);
		List<Integer> array2 = Arrays.asList(16, 8, 90);

		Collections.sort(array1);
		System.out.println("array1: ");
		for (int i = 0; i < array1.size(); i++) {
			System.out.println(array1.get(i)+ " ");
		}

		Collections.sort(array2);
		System.out.println("array2: ");
		for (int i = 0; i < array2.size(); i++) {
			System.out.println(array2.get(i)+ " ");
		}

		int n= Math.max(array1.size(), array2.size());
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (array1.get(i)==array2.get(j)){
					System.out.println("Common element: "+array1.get(i));
				}
			}
		}
	}

}
