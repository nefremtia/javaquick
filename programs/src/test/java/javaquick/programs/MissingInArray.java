package javaquick.programs;

public class MissingInArray {

	public static void main(String args[]){
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11};
		int n = num[num.length-1];
		int expsum = (n*(n+1))/2;
		int sum =0;
		System.out.println("Exp sum: "+expsum);
		
		for (int i:num){
			sum+=i;
		}
		System.out.println("Actual Sum: "+sum);
		System.out.println("Missing int: "+(expsum-sum));
	}
}
