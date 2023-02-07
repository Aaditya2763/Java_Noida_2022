package Assignment_5_String;

import java.util.Scanner;

public class canYouReadThis {

public static void main(String[] args) {
	String str="IAmA";
//	Scanner scn=new Scanner(System.in);
//	String str=scn.next();
			
	readCode(str);
}
public static void readCode(String str) {
	int i=0;
	while(i < str.length()){
		int ch=str.charAt(i);
		int j=i+1;
		
		while(j<str.length() && str.charAt(j)>='a' && str.charAt(j)<='z') {
			j++;
			
		}
	
		System.out.println(str.substring(i, j));
		i=j;	
		
	}
}
}
