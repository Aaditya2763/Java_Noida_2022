package leetcode_pod;

import java.util.Scanner;

public class longest_palindromic_subsequence {
	static int maxlen=0;
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	String s = scn.next();
//	int len=0;

	
	System.out.println(maxlength(s,""));
//	System.out.println(isPalindrome("kamal"));
}
public static int maxlength(String str,String ans) {
	substring(str, "");
	return maxlen;
}
public static void substring(String str,String ans) {
	if(str.length()==0) {
		if(isPalindrome(ans)) {
			int strLen=ans.length();
			maxlen=Math.max(maxlen, strLen);
//			System.out.println(ans);	
		}
		
		
	}
	char ch=str.charAt(0);
	substring(str.substring(1), ans+ch);
	substring(str.substring(1), ans);
}
public static boolean isPalindrome(String str) {
	int i=0;
	int j=str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}
