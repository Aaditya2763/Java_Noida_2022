package lecture_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_Sum_of_two_Arrays {
public static void main(String[] args) {
//	
 Scanner scn=new Scanner(System.in);
 int n=scn.nextInt();
 int[] arr1=new int[n];
 for(int i=0;i<arr1.length;i++) {
	 arr1[i]=scn.nextInt();
 }
 int m=scn.nextInt();
 int[] arr2=new int[m];
 for(int j=0;j<arr1.length;j++) {
	 arr2[j]=scn.nextInt();
 }
 
	Sum(arr1,arr2);
	
}
public static void Sum(int []arr1,int[]arr2){
	int i=arr1.length-1;
	int j=arr2.length-1;
	int carry=0;
	ArrayList<Integer>list=new ArrayList<>();
	while(i>=0 && j>=0) {
		int sum =arr1[i]+arr2[j]+carry;
		list.add(sum%10);
		carry=sum/10;
		i--;
		j--;
	}
	//if elements in arr1 is greater than elements in arr2;
	while(i>=0) {
		int sum =arr1[i]+carry;
		list.add(sum%10);
		carry=sum/10;
		i--;
		
	}
	//if elements in arr2 is greater than elements in arr1;
	while(j>=0) {
		int sum =arr2[j]+carry;
		list.add(sum%10);
		carry=sum/10;
		j--;
		
	}
	if(carry!=0) {
		list.add(carry);
	}
	
	Collections.reverse(list);
	for(int k=0;k<list.size();k++) {
		System.out.print(list.get(k)+", ");
	}
	System.out.println("END");
	
	
}
}
