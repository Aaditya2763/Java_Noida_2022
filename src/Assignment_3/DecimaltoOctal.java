package Assignment_3;

import java.util.Scanner;

public class DecimaltoOctal {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int sum=0;
	int mul=1;
	while(n>0) {
		int rem=n%8;//destination
		sum=sum+rem*mul;
		n/=8;//source
		mul=mul*10; //source
	}
	System.out.println(sum);
}
}
