package Assignment_3;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	int num=scn.nextInt();
	int sum=0;
	int pos=1;
	while(num>0) {
		int rem=num%10;
		sum=(int)(sum+pos*Math.pow(10, rem-1));
		pos++;
		num=num/10;
	}
	System.out.println(sum);
}
}
