package patternAssignment;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=n;
		int space=n-1;
		int row=1;
		
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int i=1;
			while(i<=star) {
				if(row>1 && row<n && i>1 && i<n) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
				i++;
			}
			
			
			

			
			System.out.println();
			row++;
			space--;
	
			
			
			
			
		}
	}

}
