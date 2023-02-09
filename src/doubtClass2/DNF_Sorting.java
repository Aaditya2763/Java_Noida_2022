package doubtClass2;

import java.util.Scanner;

public class DNF_Sorting {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int[]arr=new int [n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
	}
	Sort(arr);
}
// See  Question sorting in linear Time  to get the proper explanation
public static void Sort(int []arr) {
	int i=0;
	int l=0;//sorting for 0
	int r=arr.length-1; //sorting for 2
	while(i<=r) {
		if(arr[i]==0) {
			int temp=arr[i];
			arr[i]=arr[l];
			arr[l]=temp;
			i++;
			l++;
		}
		else if(arr[i]==2) {
			int temp=arr[i];
			arr[i]=arr[r];
			arr[r]=temp;
			r--;
		}
		else {
			i++;
		}
	}
}
}
