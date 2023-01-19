package Assignment_4_2d_Array;

import java.util.Scanner;

public class transposeOfAMatrix {
public static void main(String[] args) {
	
	int[][] arr = { { 11, 12, 13, 14,15}, 
	                { 21, 22, 23, 24, 25 }, 
	                { 31, 32, 33, 34, 35 }, 
	                { 41, 42, 43, 44, 45 },
	                { 51, 52, 53, 54, 55}};
	
//	Scanner scn = new Scanner(System.in);
//	int n=scn.nextInt();
//	
//	int [][]arr=new int[n][n];
//	for(int i=0;i<n;i++) {
//		for(int j=0;j<n;j++) {
//			arr[i][j]=scn.nextInt();
//		}
//	}	
	transpose(arr);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
		}

public static void transpose(int[][]arr) {
	for(int row=0;row<=arr.length-1;row++) {
	  for(int col=row+1;col<=arr[0].length-1;col++) {
		int temp=arr[row][col];
		arr[row][col]=arr[col][row];
		arr[col][row]=temp;
		
	}
	}
}

}
