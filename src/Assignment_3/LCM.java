package Assignment_3;

import java.util.Scanner;

public class LCM {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int divisor=scn.nextInt();
	int divident=scn.nextInt();
	int product=divident*divisor;
	while(divident%divisor!=0){
	    int rem=divident%divisor;
	     divident=divisor;
	   divisor=rem;
	}
	System.out.println(product/divisor);
}
}
