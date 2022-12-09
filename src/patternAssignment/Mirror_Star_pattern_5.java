package patternAssignment;

import java.util.Scanner;

public class Mirror_Star_pattern_5 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int space=n/2;
		int row=1;
		
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			
			if(row<=n/2) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			
			
			System.out.println();
			row++;
			
	
			
			
			
			
		}
	}

}
