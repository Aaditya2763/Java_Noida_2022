package lecture22;

import java.util.Scanner;

public class subSequence {
public static void main(String[] args) {
//	String str="abcd";
Scanner scn=new Scanner(System.in);
String str=scn.next();
	printSub(str,"");
	System.out.println(countSub(str,0));
	
}
public static void printSub(String str,String ans) {
	if(str.length()==0) {
		System.out.println(ans+" ");
		return;
	}
	char ch=str.charAt(0);
	printSub(str.substring(1),ans);
	printSub(str.substring(1),ans+ch);
}
public static int countSub(String s, int index) {
    if (index == s.length()) {
        return 1;
    }
    int count = countSub(s, index + 1);
    count += countSub(s, index + 1 );
    System.out.println("coumnt id"+count);
    return count;
}
}

