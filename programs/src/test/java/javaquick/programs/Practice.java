package javaquick.programs;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Practice {
	public static void main(String args[]) {
//		int[] array = { 14, 16, 65, 3, 2, 67 };
//		int[] sortedarray = bubblesort(array);
//		for (int i : sortedarray) {
//			System.out.println(i);
//		}
//		int[] selectionsort = selectionsort(array);
//		for (int i : selectionsort) {
//			System.out.println(i);
//		}

		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the string to reverse");
//		String str = scan.nextLine();
//		String revstr = reverse(str);
//		System.out.println("Reversed string: " + revstr);
//		
//		System.out.println("Enter number to checkPrime: ");
//		int num=scan.nextInt();
//		System.out.println(num + " prime ? "+isPrime(num));
//		for (int i=1;i<=num;i++){
//		int fibo = getFibonacci(i);
//		System.out.println(fibo);
//		}
		System.out.println("Enter number for factorial: ");
		int fact=scan.nextInt();
		System.out.println("Factorial of "+fact+" is "+factorial(fact));
		scan.close();
		
	}
	
	private static int factorial(int fact) {
		for (int i=fact-1;i>1;i--){
			fact=fact*i;
		}
		return fact;
	}

	private static boolean isPrime(int num){
		
		for(int i=2;i<Math.sqrt(num);i++){
			if (num%i==0){
				return false;
			}
		}
		return true;
	}
	
	

	private static int getFibonacci(int num) {
		int fibo=0, fibo1=1, fibo2=1;
		if (num==1 || num==2){
			return 1;
		}
		for (int i=3;i<=num;i++){
			fibo=fibo1+fibo2;
			fibo2=fibo;
			fibo1=fibo2;
		}
		return fibo;
		
	}

	private static String reverse(String str) {
		String revstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + Character.toString(str.charAt(i));
		}
		return revstr;
	}

	private static int[] bubblesort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	private static int[] selectionsort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int index = i;
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					index = j;
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
