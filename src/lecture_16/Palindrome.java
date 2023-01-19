package lecture_16;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String s=scn.next();
	System.out.println(ispalindrome(s));
}

public static boolean ispalindrome(String s1) {
	int i=0;
	int j=s1.length()-1;
	while(i<j) {
		if(s1.charAt(i)!=s1.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}
