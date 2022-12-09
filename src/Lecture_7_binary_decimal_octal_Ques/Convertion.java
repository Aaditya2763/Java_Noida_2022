package Lecture_7_binary_decimal_octal_Ques;

import java.util.Scanner;

public class Convertion {
	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
//		byte b =(byte)(191);
////		System.out.println(b);
//		int a=10;
//		b=(byte)(a);
//		b=10; // implicit typecasting done by compiler
//		
//	//by default literal gives int value in case of int,long valueso we have to convert it into long by explicit typecating by adding  L at the end
//		long l =2894999929L; //explicit typecating
//		
//		
//		//by default literal gives double value in case og double and float
//		double d=8.9;
//		float f=8.9f; //hard coded float (literal) gives double valueso we have to convert it ino flot by explicit typecating by adding  f at the end
//		
//		
//		boolean f1=true;
//		boolean f2=false;
//		
//		char str ='a';
//		//or
//		char ch1=scn.next().charAt(0);
//		str++; //implicit typecast str=(char)(str+1)
//		
//		str=(char)(str+1);//explicit typecasting
//		System.out.println(str);
		for(byte b=0;b<128;b++) {
			// it will give -127 to 128(infinite loop) due to internally type casting at 128by compiler 
			System.out.println(b);
		}
		for(byte b=0;b<=127;b++) {
			// it will give -127 to 128(infinite loop) due to internally type casting at 128by compiler 
			System.out.println(b);
		}
		
		for(byte b=0;b<126;b++) {
			//it will  give (0-126);
			System.out.println(b);
		}
		
	}

}
