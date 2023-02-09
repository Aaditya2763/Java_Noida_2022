package bitmaskingAssignment;

import java.util.Scanner;

public class countSetbit {
public static void main(String[] args) {
	int [] arr= {5,4,15};
//	Scanner scn=new Scanner(System.in);
//    int n=scn.nextInt();
//    int []arr=new int[n];
//    for(int i=0;i<arr.length;i++){
//        arr[i]=scn.nextInt();
//    }
// count(arr);
 Fastcount(arr);
}
public static void count(int[] arr) {
	for (int i=0;i<arr.length;i++) {
		int count=0;
		int n=arr[i];
	
		while(n!=0) {
			if((n&1)!=0) {
				count++;
			}
			
				n=n>>1;
			
			
		}
		System.out.println(count);
		}
//	System.out.println(count);
}


public static void Fastcount(int[] arr) {
	for (int i=0;i<arr.length;i++) {
		int count=0;
		int n=arr[i];
	
		while(n!=0) {
			n=n&(n-1);
			count++;
		}
		System.out.println(count);
		}
//	System.out.println(count);
}
}
