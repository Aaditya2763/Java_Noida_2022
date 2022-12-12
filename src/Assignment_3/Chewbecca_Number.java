package Assignment_3;

import java.util.Scanner;

public class Chewbecca_Number {
public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	   long num=scn.nextLong();
	  System.out.println(InvertingNum(num));
	}
	 public static long InvertingNum(long n) {
		 long sum=0;
		 long p=1;
		 while(n!=0) {
			 long rem=n%10;
			
			if(rem>4) {
				if(rem!=9) {
					rem=9-rem;
					
				}else if(rem==9 && n/10!=0) {
					rem=0;
				}
			
			}
			sum=sum+rem*p;
			p=p*10;
			n=n/10;
		 }
		 return sum;
	 }
}
