package Assignment_4_2d_Array;

import java.util.Scanner;

public class piyushInMagicalPark {
	public static void main(String[] args) {
//	String [][] arr = { {".",".","*","." },
//	               {".","#",".","."},
//	                {"*","*",".","."},
//	               {".","#","*","*"},
//                    };
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();
		int M = scn.nextInt();
		int K = scn.nextInt();
		int S = scn.nextInt();

		String[][] arr = new String[N][M];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.next();
			}

		}
		printStrength(arr, 20, 5);
	}

	public static void printStrength(String[][] arr, int strength, int minStrength) {
		int step = 1;
		int row = 0;
		int col = 0;
		while (row <= arr.length - 1 && col <= arr[0].length - 1) {

			if (arr[row][col] == ".") {
				strength = strength - step - 2;
				col++;
			}
			if (arr[row][col] == "*") {
				strength = strength - step + 5;
				col++;
			}

			if (arr[row][col] == "#") {
				row++;
				col = 0;
			}

			if (col == arr[0].length - 1 && arr[row][col] == ".") {
				strength = strength - 2;
				row++;
				col = 0;
			}
			if (col == arr[0].length - 1 && arr[row][col] == "*") {
				strength = strength + 5;
				row++;
				col = 0;
			}

		}
		if (strength > minStrength) {
			System.out.println("Yes");
			System.out.println(strength);
		}
		if (strength < minStrength) {
			System.out.println("No");
		}

	}

}
