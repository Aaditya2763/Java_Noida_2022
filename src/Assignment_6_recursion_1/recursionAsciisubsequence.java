package Assignment_6_recursion_1;

import java.util.Scanner;

public class recursionAsciisubsequence {
	static int count=0;
	 public static void main(String args[]) {
		 
			String str="abc";
//		 Scanner scn=new Scanner(System.in);
//		 String str=scn.next();
		 	printSub(str,"");
		 	System.out.println();
//		 	System.out.print(count);
		 }
		 public static void printSub(String str,String ans) {
			 
		 	if(str.length()==0) {
		 		count++;
		 		System.out.print(ans+" ");
		 		return;
		 	}
		 	char ch=str.charAt(0);
		 	printSub(str.substring(1),ans);
		 	printSub(str.substring(1),ans+ch);
		 	printSub(str.substring(1),ans+""+(int)ch);
		 }
		 
}
