package Assignment_6_recursion_1;

import java.util.Scanner;

public class subsetProblemRecursion {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int []arr=new int[n];
	for (int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
		}
	int target=scn.nextInt();
	

	 System.out.println(targetSum(arr,0, target,"", 0));
	
	}
public static int targetSum(int []arr ,int cur,int target,String ans,int idx) {
	if(cur==target ) {
		System.out.println(ans);
		return 1;
	}
	

	int a1=0;
for(int i=idx;i<arr.length;i++) {
	a1=a1+targetSum(arr,cur+arr[i], target, ans+arr[i],i+1);
}
	return a1;
}
}
