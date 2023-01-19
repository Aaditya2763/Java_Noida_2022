package Assignment_4_Array1;

import java.util.Scanner;

public class Arrays_Reverse_an_Array {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	 int n=scn.nextInt();
	 int [] arr=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();	}
	
reverseArray(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
 }
}

public static int [] reverseArray(int []arr,int i,int j){
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	
	return arr;
}

}
