package Lecture_7_binary_decimal_octal_Ques;

import java.util.Scanner;

public class decimal_to_binary {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int sum=0;
	int mul=1;
	while(n>0) {
		int rem=n%2;
		sum=sum+rem*mul;
		n/=2;
		mul=mul*10;
	}
	System.out.println(sum);
}
}
