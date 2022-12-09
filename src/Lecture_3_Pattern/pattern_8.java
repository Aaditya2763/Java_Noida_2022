package Lecture_3_Pattern;

import java.util.Scanner;

public class pattern_8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int star = 1;
	int space = n-1;
	int row = 1;
	while (row <= n) {
		int i = 1;
		while (i <= space) {
			System.out.print("  ");
			i++;

		}
		int j = 1;
		while (j <= star) {
			if(j%2==0) {
				System.out.print("! ");
			}
			else {
				System.out.print("* ");
			}
			
			j++;
		}
		System.out.println();
		row++;
		space--;
		star=star+2;
	}

}
}
