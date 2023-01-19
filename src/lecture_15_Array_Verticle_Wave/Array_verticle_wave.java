package lecture_15_Array_Verticle_Wave;

import java.util.Scanner;

public class Array_verticle_wave {
public static void main(String[] args) {
//	Scanner scn=new Scanner(System.in);
//	int m=scn.nextInt();
//	int n=scn.nextInt();
//	int [][]arr=new int[m][n];
//	
//	for(int i=0;i<m;i++) {
//		for(int j=0;j<n;j++) {
//			arr[i][j]=scn.nextInt(); 
//		}
	int [][]arr=  {{1,2,3,4,5},
	              {6,7,8,9,10},
	               {11,12,13,14,15},
	                 {16,17,18,19,20}};
	Display(arr);
		
}
public static void Display(int [][]arr) {
	for (int col=0 ;col<arr.length;col++) {
		if(col%2==0) {
			for(int row=0;row<arr.length;row++) {
				System.out.println(arr[row][col]+" ");
			}
		}
		else {
			for(int row=arr.length-1;row>=0;row--) {
				System.out.println(arr[row][col]+" ");
			}
		}
	}
}
}
