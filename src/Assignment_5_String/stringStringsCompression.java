package Assignment_5_String;

import java.util.Scanner;

public class stringStringsCompression {
public static void main(String[] args) {
	String str="aaabbccds";
//	Scanner scn=new Scanner(System.in);
//	String str=scn.next();
	compression(str);

}
public static void compression(String str) {
	String ans="";
	int count=1;
	for(int i=1;i<str.length();i++) {
		if(str.charAt(i)==str.charAt(i-1)) {
			count++;
			
		}

		else if(count<=1) {
			
			
				ans=ans+str.charAt(i-1);
		}

			else {
				ans=ans+str.charAt(i-1)+count;
				count=1;
			}
			
				
			
					}
	
	if(count<=1) {
		ans=ans+str.charAt(str.length()-1);
		
		
	}
	else {
		ans=ans+str.charAt(str.length()-1)+count;
	}
	
	System.out.println(ans);
	
}
}
