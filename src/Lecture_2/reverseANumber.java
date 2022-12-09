package Lecture_2;

import java.util.Scanner;

public class reverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scn= new Scanner(System.in);
		    int n=scn.nextInt();
		    int rev=0;
		    int rem;
		   
		while(n>0){
	      rem=n%10;
	      rev=rev*10+rem;
	      n=n/10;
		 

		}
		System.out.println(rev);
		
	}

}
