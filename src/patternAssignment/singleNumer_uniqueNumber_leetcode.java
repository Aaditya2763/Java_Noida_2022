package patternAssignment;

import java.util.Scanner;

public class singleNumer_uniqueNumber_leetcode {
public static void main(String[] args) {
//	Scanner scn=new Scanner(System.in);
//	int n=scn.nextInt();
//	int[] arr=new int[n];
//	for (int i=0;i<arr.length;i++) {
//		arr[i]=scn.nextInt();
//	}
	int[] arr= {2,2,1,3,3,4,4};
	uniqueNumber(arr);
	
	
	}
public static void uniqueNumber(int[] arr) {
	int ans =0;
	for (int i=0;i<arr.length;i++) {
		ans =ans^arr[i];
	}
	System.out.println(ans);
}
}
