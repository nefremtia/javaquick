package javaquick.programs;

import java.util.Arrays;

import org.testng.annotations.Test;

/**
 * Program: Print missing number in an array
 * 
 * Sort the array first If difference is 1 then no need to do any thing because
 * numbers are in order. If difference is not equal to 1 then we need to print
 * all those numbers or pick those numbers and place it in one array. Here there
 * may be a chance of array not starting with 1 then we need to check first
 * itself whether array starts with 1 or not if not we need to print 1 to start
 * element of array.
 * 
 * @author smukhopadhyay1
 */

public class MissingNumberInArray {

	@Test
	public void printMissingNumberInArray() {
		int[] number = { 1, 4, 5, 6, 8 };

		Arrays.sort(number);
		findMissingNumber(number);
	}

	private void findMissingNumber(int[] number) {

		// max length is the last number in the array
		int k[] = new int[number[number.length - 1]];
		int m = 0;

		// if 1 is not present in the array
		if (number[0] != 1) {
			for (int x = 1; x < number[0]; x++) {
				k[m] = x;
				m++;
			}
		}

		for (int i = 0; i < number.length - 1; i++) {
			int j = i + 1;
			int difference = number[j] - number[i];
			if (difference != 1) {
				for (int x = 1; x < difference; x++) {
					k[m] = number[i] + x;
					m++;
				}
			}
		}
		System.out.println("missing numbers in array ::");
		for (int l = 0; l < m; l++) {
			System.out.println(k[l] + " ");
		}
	}
}
