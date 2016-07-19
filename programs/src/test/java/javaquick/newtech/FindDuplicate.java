package javaquick.newtech;

public class FindDuplicate {

	public static void main(String args[]) {
		int[] array = { 13, 16, 87, 44, 89, 87 , 63, 63};
		for (int i = 0; i <array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if ((array[i] == array[j]) && i!=j)
					System.out.println(array[i] + " is common");
			}

		}

	}

}