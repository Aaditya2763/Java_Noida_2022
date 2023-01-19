package Assignment_4_Array1;

import java.util.Scanner;

public class bubbleSort {
public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);
	 int n=scn.nextInt();
//			int [] arr= {5,4,3,2,1};
	 int [] arr= new int [n];
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=scn.nextInt();
	 }
	Sorting(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
public static void Sorting(int []arr) {
	
	for(int i=1;i<arr.length;i++) {
		for(int j=0;j<arr.length-i;j++){
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
	
}
}
