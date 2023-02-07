package Assignment_5_String;

import java.util.Scanner;

public class stringToggleCase {
public static void main(String[] args) {
//	String str="azCD";
	Scanner scn=new Scanner(System.in);
	String str=scn.next();
			
	asciiCode(str);
}
public static void asciiCode(String str) {
	for(int i=0;i<str.length();i++) {
		int ch=str.charAt(i);
		if(ch>=65 && ch<=90) {
			ch=ch+32;
		}
		else {
			ch=ch-32;
		}

		
		System.out.print((char)ch);
	}

	
}
}
