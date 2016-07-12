package javaquick.programs;

/**
 * Selection Sort- In an array select an element and compare it with the next
 * one, if greater swap, if not then move on to compare the same element with
 * the next Do this in a loop so that each element gets selected once, by the
 * end of the loop, the array will be sorted
 * 
 * @author smukhopadhyay1
 *
 */

public class SelectionSort {

	public static void main(String a[]) {

		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		arr1 = doSelectionSort(arr1);
		for (int i : arr1) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	public static int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			// Selecting the index element
			int index = i;

			// Loop to compare the index element with all the other elements in
			// the array
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					// Smaller element becomes the index
					index = j;

			// Swap the numbers
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}
}
