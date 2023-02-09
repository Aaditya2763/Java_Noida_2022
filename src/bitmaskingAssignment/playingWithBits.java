package bitmaskingAssignment;

import java.util.Scanner;

public class playingWithBits {

public static void main(String[] args) {
	int [] arr= {10,15};
	Scanner scn=new Scanner(System.in);
	   int q=scn.nextInt();
	   while(q-->0) {
		   int a=scn.nextInt();
		   int b=scn.nextInt();
		   totalBits(a,b);
	   }
 
}
public static void totalBits(int a ,int b) {
	int totalcounts=0;
	for (int i=a;i<=b;i++) {
		int count=0;
		int n=i;
	
		while(n!=0) {
			if((n&1)!=0) {
				count++;
			}
			
				n=n>>1;
			
			
		}
//		System.out.print(count);
		totalcounts+=count;
		}
System.out.println(totalcounts);
}


public static void Fastcount(int a,int b) {
	int totalcounts=0;
	for (int i=a;i<=b;i++) {
		int count=0;
		int n=i;
	
		while(n!=0) {
			n=n&(n-1);
			count++;
			
		}
		totalcounts+=count;
//		System.out.println(count);
		}
	System.out.println(totalcounts);
}
}


