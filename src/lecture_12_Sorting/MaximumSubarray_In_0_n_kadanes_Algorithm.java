package lecture_12_Sorting;

public class MaximumSubarray_In_0_n_kadanes_Algorithm {
public static void main(String[] args) {
	int []arr= {-2,1,-3,4,-1,2,1,-5,4};
	
	System.out.println(MaximumSum(arr));
}
public static int MaximumSum(int[] arr) {
	int ans=Integer.MIN_VALUE;
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		ans=Math.max(ans, sum);
		
		if(sum<0) {
			sum=0;
		}
	
		
	}
	return ans;
	
}
}
