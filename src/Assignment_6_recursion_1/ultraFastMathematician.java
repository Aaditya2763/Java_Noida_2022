package Assignment_6_recursion_1;

import java.util.Scanner;

public class ultraFastMathematician {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	while(n-->0) {
	String str1=scn.next();
	String str2=scn.next();
//	answer(str1,str2,"",0);
	answer2(str1,str2,"");
	}
	}

//By using recursion 

//public static void answer( String str1,String str2,String ans,int index) {
//if(index==str1.length()) {
//	System.out.println(ans);
//	return;
//}
//if(str1.charAt(index)=='1' && str2.charAt(index)=='1') {
//	answer(str1, str2, ans+"0", index+1);
//	
//}
//else if(str1.charAt(index)=='0' && str2.charAt(index)=='0') {
//	answer(str1, str2, ans+"0", index+1);
//}
//else {
//	answer(str1, str2, ans+"1", index+1);
//}
//}

public static void answer2(String str1,String str2,String ans) {
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)=='1' && str2.charAt(i)=='1') {
			ans=ans+"0";
		}
		else if(str1.charAt(i)=='0' && str2.charAt(i)=='0') {
			ans=ans+"0";
		}
		else {
		
				ans=ans+"1";
			}
		}
	System.out.println(ans);
	}

}

