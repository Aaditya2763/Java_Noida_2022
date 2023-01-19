package Assignment_4_Array1;

import java.util.Scanner;

public class armstrongNumber {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n1=scn.nextInt();
	int n2=scn.nextInt();
isArmstrong(n1,n2);
}
public static int countOfDigits(int n) {
	int count=0;
	while(n!=0) {
		int rem=n%10;
		count++;
		n/=10;
	}
	return count;
}
public static int sumOfDigits(int n) {
	int count=countOfDigits(n);
	int sum=0;
	while(n!=0) {
		int rem=n%10;
		sum=(int)(sum+Math.pow(rem,count));
		n/=10;
	}
	return sum;
}
public static void isArmstrong(int n1,int n2) {
	
	for (int i=n1;i<=n2;i++) {
		int sum=sumOfDigits(i);
		if(i==sum) {
			System.out.println(i);
		}
}
}
}
