package Assignment_recursionAndBacktracking;

import java.util.Scanner;

public class sudokuSolver {
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[][]arr=new int [n][n];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[0].length;j++) {
		arr[i][j]=scn.nextInt();
	}
}

Print(arr, 0, 0);
}
public static void Print(int[][] grid, int row, int col) {
	if (col == 9) {
		col = 0;
		row++;
	}
	if (row == 9) {
		display(grid);
		return;
	}

	if (grid[row][col] != 0) {
		Print(grid, row, col + 1);
	} else {
		for (int val = 1; val <= 9; val++) {
			if (issafe(grid, row, col, val)) {
				grid[row][col] = val;
				Print(grid, row, col + 1);
				grid[row][col] = 0;
			}
		}
	}

}

public static boolean issafe(int[][] grid, int row, int col, int val) {
	// TODO Auto-generated method stub
	// col
	for (int i = 0; i < 9; i++) {
		if (grid[i][col] == val) {
			return false;
		}

	}
	// row
	for (int i = 0; i < 9; i++) {
		if (grid[row][i] == val) {
			return false;
		}

	}
	int r = row - row % 3;
	int c = col - col % 3;
	for (int i = r; i < r + 3; i++) {
		for (int j = c; j < c + 3; j++) {
			if (grid[i][j] == val) {
				return false;
			}
		}
	}
	return true;

}

public static void display(int[][] grid) {
	// TODO Auto-generated method stub
	for (int i = 0; i < grid.length; i++) {
		for (int j = 0; j < grid.length; j++) {
			System.out.print(grid[i][j] + " ");
		}
		System.out.println();
	}

}
}
