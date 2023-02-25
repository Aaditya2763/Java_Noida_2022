package Assignment_4_Array1;

import java.util.Scanner;

public class maximumCircularSum {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
//		Scanner scn=new Scanner(System.in);
//		int t=scn.nextInt();
//		while(t-->0){
//			int n=scn.nextInt();
//		int []arr=new int[n];
//		for(int i=0;i<arr.length;i++){
//			arr[i]=scn.nextInt();
//		}
//		System.out.println(Circular_Sum(arr));
//		}
//		
		 System.out.println(Circular_Sum(arr));
	}

	public static int Circular_Sum(int[] arr) {

		int len_Sum = MaximumSum(arr);
		System.out.println("Linear sum"+len_Sum);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			arr[i] *= -1;
		}
		int mid_sum = MaximumSum(arr);
		System.out.println("mid sum"+mid_sum);
		int curr = sum + mid_sum;
		if (curr == 0) {
			return len_Sum;
		}

		return Math.max(curr, len_Sum);

	}

	public static int MaximumSum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}


