package Assignment_6_recursion_1;

import java.util.Scanner;

public class firstIndex {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int []arr= new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
	}
	int m=scn.nextInt();
	
	System.out.println(index(arr, m, 0));
}
public static int index(int []arr,int target,int idx) {

if(idx==arr.length-1) {
	return -1;
}
if(arr[idx]==target) {
	return idx;
}
int i=index(arr, target, idx+1);
	
	return i;
}
}
