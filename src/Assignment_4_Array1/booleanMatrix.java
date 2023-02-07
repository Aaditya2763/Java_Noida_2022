package Assignment_4_Array1;

import java.util.Scanner;

public class booleanMatrix {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
			int [][]arr=new int[n][m];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					arr[i][j]=scn.nextInt();
				}
			}
			matrix(arr);
}
public static void matrix(int[][] arr) {
	for (int i=0;i<arr.length;i++) {
		for(int j=0;j<i;j++) {
			if(arr[i][j]==1) {
				arr[i][j+1]=1;
				arr[i+1][j]=1;
			}
			
		}
		System.out.println(arr);
	}
}
}
