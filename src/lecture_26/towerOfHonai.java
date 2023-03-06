package lecture_26;

import java.util.Scanner;

public class towerOfHonai {
		
		public static void main(String[] args) {
	//		int n=3;
	//		toh(n,"A","C","B");
			 Scanner scn=new Scanner(System.in);
		        int n=scn.nextInt();
		        toh(n,"T1","T3","T2");
		
		}
		public static void toh(int n,String src,String des,String hlp) {
			if(n==0) {
				return;
			}
			toh(n-1,src,hlp,des);
			System.out.println("Move "+n+" th disk from "+src+" to "+des);
			toh(n-1,hlp,des,src);
		}
		
		}
