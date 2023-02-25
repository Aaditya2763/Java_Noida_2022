package Hackathon1;

import java.util.Scanner;

public class Candies {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in); 
	int t=scn.nextInt();
	while(t-->0) {
	int x=scn.nextInt();
	int n=scn.nextInt();
	System.out.println(Minimisecandies(x,n));
	}
//	Minimisecandies(12,4);
	
}
 public static int  Minimisecandies(int x, int n) {
	int ans=12%4;
	 int diff=n-ans;
	 return Math.min(ans,diff);
 }
}
