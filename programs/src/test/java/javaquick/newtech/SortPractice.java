package javaquick.newtech;

public class SortPractice {
	public static void main(String args[]) {
		int[] input = { 3, 12, 15, 9, 5, 78, 13, 2, 3 };
		int[] sortedarr = doSorting(input, "Selection");
		for (int i : sortedarr) {
			System.out.print(i + ", ");
		}
	}

	private static int[] doSorting(int[] array, String option) {

		switch (option) {
		case ("Bubble"): {
			for (int i = array.length; i >= 0; i--) {
				for (int j = 0; j < array.length - 1; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j + 1];
						array[j + 1] = array[j];
						array[j] = temp;

					}
				}
			}
		}
		case ("Selection"): {
			for (int i=0;i<array.length;i++){
				int index=i;
				for (int j = 0;j<array.length;j++){
					if (array[index]<array[j]){
						index=j;
						int temp= array[j];
						array[j]=array[i];
						array[i]=temp;
					}
				}
			}
		}
		}
		return array;
	}

}
