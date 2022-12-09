package Lecture_5_imp;

import java.util.Scanner;

public class hcf {
public static void main(String[] args) {
	//Write your code here again and again 
	
	Scanner scn=new Scanner(System.in);
	int divisor= scn.nextInt();
	int divident=scn.nextInt();
	
	//if we put while(divident % divisor ==0)  it will not work beacuse 60%36 is not eqaual to 0;
	while(divident % divisor !=0) {

		int rem=divident%divisor;
		//divisor=rem ;
		//Note(we can't write line 15 first because divisor's value will store the value of rem
		//
		
		 divident =divisor;
		divisor=rem;
	}
	System.out.println(divisor);
	
}
}
