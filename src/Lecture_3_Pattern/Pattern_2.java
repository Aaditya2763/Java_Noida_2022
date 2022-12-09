package Lecture_3_Pattern;

import java.util.Scanner;

public class Pattern_2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;

		while (row <= n) {
			int i = 1;
			while (i <= row) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
		}

	}

}
