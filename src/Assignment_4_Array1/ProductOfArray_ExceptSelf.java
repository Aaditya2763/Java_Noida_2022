package Assignment_4_Array1;

import java.util.Scanner;

public class ProductOfArray_ExceptSelf {
public static void main(String[] args) {
	
	Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
	 int [] arr=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
		}
	long []ans=product(arr);
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(ans[i]+" ");
	}
	
}
public static long [] product(int[]arr) {
int n=arr.length;
	long []left = new long [n];
	left[0]=1;
	for(int i=1;i<left.length;i++) {
		left[i]=left[i-1]*arr[i-1];
	}
	
	
long []right=new long [n];
right[n-1]=1;
for(int i=n-2;i>=0;i--) {
	 right[i]=right[i+1]*arr[i+1];

}

for(int i=0;i<left.length;i++) {
		left[i]=left[i]*right[i];
	}
	
return left;
}

}
