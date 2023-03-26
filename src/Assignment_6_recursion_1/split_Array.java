package Assignment_6_recursion_1;

import java.util.Scanner;

public class split_Array {
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] arr=new int [n];
for(int i=0;i<n;i++) {
	arr[i]=scn.nextInt();
}
System.out.println(splitArray(arr, 9,"", 0, "", 0, 0));
}
public static int  splitArray(int[]arr,int target,String ans1,int sum1,String ans2,int sum2,int index) {
	
	if(index==arr.length) {
		if(sum1==target && sum2==target) {
			System.out.println(ans1+"and"+ans2);
			return 1;
		}
	}
	int p1=0;
	int p2=0;
	for(int i=0;i<arr.length;i++) {
		p1=splitArray(arr,target,ans1+arr[i],sum1+arr[i],ans2,sum2,index+1);
		p2=splitArray(arr, target, ans1,sum1,ans2+arr[i],sum2+arr[i],index+1);
	}
	
return p1+p2;
}
}
