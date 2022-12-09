package Lecture_7_binary_decimal_octal_Ques;

import java.util.Scanner;

public class octal_to_decimal {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	// this formula work only if source or destination conation a decimal
	//source=multiply;
	//destination=division
	//here source =octal
	//here destination =decimal
	int n=scn.nextInt();
	int sum=0;
	int mul=1;
	while(n>0) {
		int rem=n%10; //destination division by 10
		sum=sum+rem*mul;
		n/=10; //destination division by 10
		mul=mul*8;//source multiply by octal(8)
	}
	System.out.println(sum);
}
}
