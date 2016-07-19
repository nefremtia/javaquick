package javaquick.newtech;

/**
 * Bubble Sort: Compare and swap if greater than the previous number
 * Best case: O(n) when the array is already sorted
 * @author smukhopadhyay1
 *
 */
public class BubbleSort {
	
	public static void main(String args[]){
		int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		bubble_srt(input);
		
	}

	private static void bubble_srt(int[] array) {
		
		for (int m=0;m<array.length;m++){
			for (int i=0;i<array.length-m-1;i++){
				if (array[i]>array[i+1]){
					array[i]=array[i]+array[i+1];
					array[i+1]=array[i]-array[i+1];
					array[i]=array[i]-array[i+1];
				}
			}
			printNumbers(array);
		}
	}

	private static void printNumbers(int[] array) {
		for (int i=0;i<array.length;i++){
			System.out.print(array[i] + ", ");
		}
		System.out.println("\n");
	}

	/** Quick swapping without a temp variable
	private static void swap(int i, int j, int[] array) {
		i=i+j;
		j=i-j;
		i=i-j;
		
	}
	**/
	
}