package Lecture_3_Pattern;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int star=scn.nextInt();	
	int row=1;
	while(row<=star) {
		int i=1;
		while(i<=star) {
			System.out.print("* ");
			i++;
		}
		
		System.out.println();
		row++;
	}
	}

}
