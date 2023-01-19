package Assignment_4_2d_Array;

import java.util.Scanner;

public class Array_Search {
public static void main(String[] args) {
	
//	int[][] arr = { { 1, 4, 7, 11, 15 },
//			        { 2, 5, 8, 12, 19 },
//	                { 3, 6, 9, 16, 22 }, 
//	                { 10, 13, 14, 17, 24 },
//                    { 18, 21, 23, 26, 30 } };
	Scanner scn =new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
	int [][]arr=new int [n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=scn.nextInt();
		}
	}
	int ele=scn.nextInt();
	System.out.println(Search(arr,ele));
}
public static int Search(int[][]arr,int ele) {
	//Note :
	//we can't solve it by taking r=0 and c=0;
	//we cant't solve it by taking r=4 and c=4;
	//because we have sorted array if we consider r=0,c=0 or r=4,c=4 we get 1 and  suppose we have to search 9 we can't move 
	//because both row and column is either greater or less than the element
	//we need a smaller and a greater number to move to a particular element (either row is smaller or column is greater or vice versa 

//	----------------------1st way to solve by taking r=0 and c=4----------------------
	int r=0;
	int c=arr[0].length-1;
	while(r<=arr.length-1 && c>=0){
		if(arr[r][c]==ele) {
			System.out.print(r);
			System.out.print(c+"     ");
			return 1;
		}
		else if(arr[r][c]>ele) {
			c--;
		}
		else {
			r++;
		}
	}
	return 0;
	
	//-----------------------1st way to solve by taking r=4 and c=0------------------
//	int r=arr.length-1;
//	int c=0;
//	while(c<=arr[0].length-1 && r>=0){
//		if(arr[r][c]==ele) {
//			System.out.print(r);
//			System.out.print(c+"     ");
//			return 1;
//		}
//		else if(arr[r][c]>ele) {
//			r--;
//		}
//		else {
//			c++;
//		}
//	}
//	return 0;
	
	
	
	
}
}
