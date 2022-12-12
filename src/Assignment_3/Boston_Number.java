package Assignment_3;

import java.util.Scanner;

public class Boston_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
//	System.out.println(SumofDigits(num));
	int Digitsum = SumofDigits(num);
	int primefactorsSum = SumOfPrimeFactors(num);
//	System.out.println(SumOfPrimeFactors(num));
	if(Digitsum==primefactorsSum) {
	System.out.println("1");
	}
	else {
		System.out.println("0");
	}
}
public static int SumofDigits(int n) {
	int sum=0;
	while(n!=0) {
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	return sum;
}


public static int SumOfPrimeFactors(int n) {
	int sum=0;
	for (int i=2;i<=n;i++) {
		 while(n%i==0) {
			 sum=sum+i;
			 n=n/i;
		 }
	}
	
	 return sum;
}

}
