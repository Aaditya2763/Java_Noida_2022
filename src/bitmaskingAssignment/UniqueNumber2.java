package bitmaskingAssignment;

import java.util.Scanner;

public class UniqueNumber2 {
	public static void main(String[] args) {
//		int[] arr = { 3,1,2,1 };
		 Scanner scn=new Scanner(System.in);
	        int n=scn.nextInt();
	        int []arr=new int[n];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=scn.nextInt();
	        }
	       
	    
		Single_Number(arr);

	}
	


public static void Single_Number(int[] arr) {
	int ans = 0;
	for (int i = 0; i < arr.length; i++) {
		ans ^= arr[i];
	}
	int mask = (ans & (~(ans - 1)));// 010
	int a = 0;
	for (int i = 0; i < arr.length; i++) {
		if ((mask & arr[i]) != 0) {
			a = a ^ arr[i];
		}
	}
	int b = a ^ ans;
	System.out.println(a + " " + b);
}

}
