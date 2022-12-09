package Lecture_3_Pattern;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		//code 
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int row=1;
		int i=1;
		while(row<=n) {
			
			while(i<=n) {
				System.out.print("*");
				i--;
			}
			System.out.println();
			row++;
			
	
		}
		
		
		
	}
}
