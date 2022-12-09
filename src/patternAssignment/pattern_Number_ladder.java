package patternAssignment;

import java.util.Scanner;

public class pattern_Number_ladder {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int star=1;
	int row=1;
	int count=1;
	while(row<=n) {
		int i=1;
		while(i<=star) {
			System.out.print(count+" ");
			count++;
			i++;
		}
		System.out.println();
		row++;
		star++;
	}
}
}
