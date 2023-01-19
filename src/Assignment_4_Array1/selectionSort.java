package Assignment_4_Array1;

import java.util.Scanner;

public class selectionSort {
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
		
		for (int i=0;i<arr.length;i++) {
			int min =i;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) { 
					min=j;
				}
			}
			
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		
	}
	}
}
