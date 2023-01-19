package lecture_16;

import java.util.Scanner;

public class allPalindrome {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(int i=0;i<s.length();i++) {
	
	for (int j=i+1;j<s.length();j++) {
		String s1=s.substring(i,j);
		if(ispalindrome(s1)==true) {
			System.out.println(s1);
		}
	}
}
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
