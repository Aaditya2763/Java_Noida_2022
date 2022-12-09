package Lecture_4;

import java.util.Scanner;

public class pattern19 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	int n = scn.nextInt();
	int star = n/2+1;
	int row = 1;
	int space=-1;
	while(row<=n) {
		//printing stars
		int i=1;
		while(i<=star) {
			System.out.print("* ");
			i++;
		}
		//printing space
		int j=1;
		while(j<=space) {
			
			System.out.print("  ");
			j++;
		}
		
		//printing stars
		
		int k=1;
		if(row==1 || row==n) {
			k=2;
		}
		while(k<=star) {
			
			System.out.print("* ");
			k++;
		}
		if(row>n/2) {
			space-=2;
			star++;
		}
		else {
			space+=2;
			star--;
		}
		
		System.out.println();
		row++;
		
		
	}
	
	
}
}
