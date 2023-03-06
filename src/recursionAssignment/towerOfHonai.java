package recursionAssignment;

import java.util.Scanner;

public class towerOfHonai {
	 static int count=0;
		public static void main(String[] args) {
			int n=3;
//			toh(n,"A","C","B");
//			 Scanner scn=new Scanner(System.in);
//		        int n=scn.nextInt();
		        toh(n,"T1","T2","T3");
	           System.out.println(count);
		
		}
		public static void toh(int n,String src,String des,String hlp) {
//	         int count=0yj
			if(n==0) {
	          count++;
				return;
			}
			toh(n-1,src,hlp,des);
			System.out.println("Move "+n+"th disc from "+src+" to "+des);
//	          count++;
			toh(n-1,hlp,des,src);
		}
}
