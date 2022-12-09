package Lecture_4;

import java.util.Scanner;

public class pattern17 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	int n = scn.nextInt();
	int star = n/2;
	int row = 1;
	int space=1;
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
