package javaquick.programs;

import java.util.Scanner;

public class StringReversal {

	public static void main(String args[]) {
//		String str = "Brilliant";
		System.out.println("Enter String for reversal: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] chr = str.toCharArray();
		for (int i = chr.length - 1; i >= 0; i--) {
			System.out.print(chr[i]);
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		scan.close();
		
	}

}
