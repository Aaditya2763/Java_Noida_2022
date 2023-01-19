package lecture_12_Sorting;

public class Maximum_subArray {
public static void  main(String[] args) {
	int []arr= {-2,1,-3,4,-1,2,1,-5,4};
	MaximumSubArray(arr);

}
public static void MaximumSubArray(int []arr) {
	int ans =Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for (int j=i;j<arr.length;j++) {
			sum=sum+arr[j];
			ans=Math.max(sum,ans);
		}
	}
	System.out.println(ans);
}

}
