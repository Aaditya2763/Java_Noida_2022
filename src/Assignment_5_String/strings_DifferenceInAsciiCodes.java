package Assignment_5_String;

public class strings_DifferenceInAsciiCodes {
public static void main(String[] args) {
	String str="abdc";
	asciiCode(str);
}
public static void asciiCode(String str) {
	for(int i=1;i<str.length();i++) {
		char ch=str.charAt(i-1);
		int ans=str.charAt(i)-str.charAt(i-1);
		
		System.out.print(ch+""+ans);
	}
	System.out.print(str.charAt(str.length()-1));
	
}
}
