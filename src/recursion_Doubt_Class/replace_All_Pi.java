package recursion_Doubt_Class;

import java.util.Scanner;

public class replace_All_Pi {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	int t=scn.nextInt();
	while(t-->0) {
		String s=scn.next();
	replaceAll(s, " "); 
		System.out.println();
	}
}
public static void replaceAll(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
		
	}
	if(ques.length()>=2 && ques.charAt(0)=='p'&& ques.charAt(1)=='i') {
		replaceAll(ques.substring(2), ans+3.14);
	}
	else {
		replaceAll(ques.substring(1), ans+ques.charAt(0));
	}
}
}
