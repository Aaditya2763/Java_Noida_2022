package Lecture_4;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int star = 1;
		int row = 1;
		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= star) {

				System.out.print("* ");
				i++;
			}
			if (row < n) {
				star++;
			} else {
				star--;
			}

		
		System.out.println();
		row++;
		}
	}

}
