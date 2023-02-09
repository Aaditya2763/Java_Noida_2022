package Assignment_4_Array1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_targetSumPair_Self {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
//	int n= scn.nextInt();
//	int []arr=new int [n];
//	 for(int i=0;i<arr.length;i++) {
//		 arr[i]=scn.nextInt();
//	 }
	int n=5;
	int []arr={1,3,4,2,5};
	int target=5;
	 
//	 int target=scn.nextInt();
	 
	 targetPair(arr,target);
}
public static void targetPair(int []arr,int m) {
	 Arrays.sort(arr);
     int  i =0;
     int j =arr.length-1;
     while(i<j){
         if(arr[i]+arr[j]>m){
             j--;
         }else if(arr[i]+arr[j]<m){
             i++;
         }else{
             System.out.println(arr[i]+" and "+arr[j]);
             i++;
             j--;
         }
     
	}
	
}
}
