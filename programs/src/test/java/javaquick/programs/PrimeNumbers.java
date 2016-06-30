package javaquick.programs;

import org.testng.annotations.Test;

/**
 * Program: Print prime numbers Give the end number- 50 in the below case
 * initialize the count 0 Start a for loop for i from 2 till num and set count
 * value again to 0 within that start another for loop from 2 till i/2(going
 * till half way of the the actual number) Check for the reminder of i divided
 * by j, if its 0, which means divisible, change count and exit the loop
 * 
 * therefore only if the number is not divisible by any other smaller number,
 * the count remains 0 else it changes-->print current value of i only if the
 * count==0
 * 
 * @author smukhopadhyay1
 *
 */

public class PrimeNumbers {

	@Test
	public void printPrimeNumbers() {
		int num = 50;
		int count = 0;

		for (int i = 2; i < num; i++) {
			count = 0;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
}