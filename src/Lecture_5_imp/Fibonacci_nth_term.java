package Lecture_5_imp;

import java.util.Scanner;

public class Fibonacci_nth_term {
public static void main(String[] args) {
	///
	  Scanner scn=new Scanner(System.in);
	  int n=scn.nextInt();
	  int a=0;
	  int b=1;
	 
	  int i =1;
	  while(i<=n) {
		 int sum=a+b;
		  a=b;
		  b=sum;
		
		  i++;
	  }
	  System.out.println(a);
}
}
