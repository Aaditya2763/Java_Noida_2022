package Assignment_4_2d_Array;

import java.util.Scanner;

public class upperTriangleMatrix {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

//	int[][] arr = { { 11, 12, 13},  
//                    { 21, 22, 23 }, 
//                    { 31, 32, 33 }, 
//        
//	};

	printUpperTriangle(arr);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
//		arr[i][j]=scn.nextInt();
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}

}

	public static void printUpperTriangle(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (j < i) {
					arr[i][j] = 0;
				}

			}
		}
	}
}
