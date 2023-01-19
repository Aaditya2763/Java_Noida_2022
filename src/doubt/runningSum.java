package doubt;

import java.util.Scanner;

public class runningSum {

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n= scn.nextInt();
	int []arr=new int [n];
	
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=scn.nextInt();
	 }
	 
	 int []ans =runningSum(arr);
	 for(int i=0;i<ans.length;i++) {
		 System.out.println(ans[i]);;
	 }
}
	public static int [] runningSum(int []nums){
		  int[] result = new int[nums.length];

	        // Initialize first element of result array with first element in nums.
	        result[0] = nums[0];
	        for (int i = 1; i < nums.length; i++) {
	            // Result at index `i` is sum of result at `i-1` and element at `i`.
	            result[i] = result[i - 1] + nums[i];
	        }
	        return result;
	}
}


