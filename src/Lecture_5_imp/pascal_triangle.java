package Lecture_5_imp;

import java.util.Scanner;

public class pascal_triangle {
public static void main(String[] args) {
	Scanner Scn=new Scanner(System.in);
	int n=6;
	int row=0;
	int star=1;
	while(row<n){
		int i=0;
		int val=1;
		while(i<star) {
			System.out.print(val+" ");
			val=((row-i)*val)/(i+1);
			i++;
		}
		
		System.out.println();
		row++;
		star++;
		
	}
	
	
}
}
