package Assignment_4_Array1;

public class maximumCircularSum {
public static void main(String[] args) {

	int[]arr= {8, -8, 9, -9, 10, -11, 12};
	maxCirSum(arr);
	
}
//not solved
public static void maxCirSum(int []arr) {
	int ans = Integer.MIN_VALUE;// -2^31
	for(int i=0;i<arr.length;i++) {
		int sum=0;
	for(int j=0;j<arr.length;j++) {
		sum=sum+arr[j];
		System.out.println("sum"+sum);
		ans=Math.max(sum, ans);
		
		System.out.println(ans);
	}
	}
	System.out.println(ans);
}
}
