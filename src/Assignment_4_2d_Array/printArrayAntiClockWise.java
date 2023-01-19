package Assignment_4_2d_Array;

import java.util.Scanner;

public class printArrayAntiClockWise {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int row=scn.nextInt();
	int col=scn.nextInt();
	int [][]arr=new int[row][col];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j]=scn.nextInt();
		}
	}
//	int[][] arr = { { 11, 12, 13, 14,15}, 
//			        { 21, 22, 23, 24, 25 }, 
//			        { 31, 32, 33, 34, 35 }, 
//			        { 41, 42, 43, 44, 45 }, };
	
	antiSpiralArray(arr);
}
public static void antiSpiralArray(int [][]arr) {
	int minr=0;
	int minc=0;
	int maxr=arr.length-1;
	int maxc=arr[0].length-1;
	int count=0;
	int totalElement=arr.length*arr[0].length;
	while(count<totalElement) {
		for(int i=minr;i<=maxr &&count<totalElement;i++) {
			System.out.print(arr[i][minc]+", ");
			count++;
		}
		minc++;
		for(int i=minc;i<=maxc &&count<totalElement;i++) {
			System.out.print(arr[maxr][i]+", ");
			count++;
		}
		maxr--;
		
		for(int i=maxr;i>=minr &&count<totalElement;i--) {
			System.out.print(arr[i][maxc]+", ");
			count++;
		}
		maxc--;
		
		for(int i=maxc;i>=minc &&count <totalElement;i--) {
			System.out.print(arr[minr][i]+", ");
			count++;
		}
		minr++;
	}
	System.out.print("END");
}
}
