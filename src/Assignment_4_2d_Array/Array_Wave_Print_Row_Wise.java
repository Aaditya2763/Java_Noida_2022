package Assignment_4_2d_Array;

import java.util.Scanner;

public class Array_Wave_Print_Row_Wise {
	public static void main(String args[]) {
        // Your Code Here
    Scanner scn = new Scanner(System.in);
//	int row=scn.nextInt();
//	int col=scn.nextInt();
//	int [][]arr=new int[row][col];
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[0].length;j++) {
//			arr[i][j]=scn.nextInt();
//		}
//	}
		int[][] arr = { { 11, 12, 13, 14,15}, 
				{ 21, 22, 23, 24, 25 }, 
				{ 31, 32, 33, 34, 35 }, 
				{ 41, 42, 43, 44, 45 }, };

//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[0].length;j++) {
//			System.out.println(arr[i][j]);
//		}
// }
		printWave(arr);

	}

	public static void printWave(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				 for (int col = 0; col < arr[0].length; col++)
				 {
					
					System.out.print(arr[row][col]+", ");
				}
			} else {
				for (int col = arr[0].length-1; col >= 0; col--) {
					System.out.print(arr[row][col]+", ");
				}
			}
          

		}
          System.out.print("END");
	}
}
