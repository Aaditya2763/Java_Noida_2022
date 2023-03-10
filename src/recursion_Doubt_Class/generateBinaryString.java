package recursion_Doubt_Class;

import java.util.Scanner;

public class generateBinaryString {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	int t=scn.nextInt();
	while(t-->0) {
		String s=scn.next();
		BinaryString(s, "");
		System.out.println();
	}
}
public static void BinaryString(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans+" ");
		return;
	}
	char ch=ques.charAt(0);
	if(ch=='?') {
		BinaryString(ques.substring(1), ans+'0');
		BinaryString(ques.substring(1), ans+'1');
	}
	else {
	 BinaryString(ques.substring(1), ans+ch);
	}
	
}
}
