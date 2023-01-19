package Assignment_4_Array1;

import java.util.Scanner;

public class MajorityElement {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n= scn.nextInt();
	int []arr=new int [n];
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=scn.nextInt();
	 }
	 
//	int n=3;
//	int [] arr= {1,6,2};
	 int maj=-1;
	int maxCount=0;
	 
	 for(int i=0;i<arr.length;i++) { //loop for arr
		 int count=0;
		 for(int j=0;j<arr.length;j++) { //loop for elememt check

			 if(arr[i]==arr[j]) {
				 count++;
			 }
			 if(count>maxCount) {
				 maxCount=count;
				 maj=i;
			 }
		 }
 
	 }
	 if(maxCount>n/2) {
		 System.out.println(arr[maj]);
	 }
	 
}
}
