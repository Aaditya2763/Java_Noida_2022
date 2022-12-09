package Lecture_2;

import java.util.Scanner;

public class sumOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		while(n>0) {
			
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		
	}

}
