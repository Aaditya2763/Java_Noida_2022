package lecture_16;

import java.util.Scanner;

public class String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String s1=scn.next();
String s2=scn.next();
System.out.println(compare(s1,s2));
	}

	public static int compare(String s1,String s2) {
		int len=Math.min(s1.length(), s2.length());
	for(int i=0;i<len;i++)
	{
		if(s1.charAt(i)!=s2.charAt(i)) {
			return s1.charAt(i)-s2.charAt(i);
		}
	}
	return s1.length()-s2.length();
	}
}
