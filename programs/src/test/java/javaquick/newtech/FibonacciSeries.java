package javaquick.newtech;

/**
 * 
 * @author smukhopadhyay1
 *
 */
public class FibonacciSeries {

	public static void main(String args[]) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(fibonacciLoop(i));
		}

	}

	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous
										// two Fibonacci number
			fibo1 = fibo2;
			fibo2 = fibonacci;

		}
		return fibonacci; // Fibonacci number
	}
}
