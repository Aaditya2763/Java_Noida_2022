package Assignment_5_String;

public class String_Odd_Even {
public static void main(String[] args) {
	String str="abcg";
	oddEven(str);
}
public static void oddEven(String str) {
	for(int i=0;i<str.length();i++) {
		int ch =str.charAt(i);
		if(i%2==0) {
			ch=ch+1;
		}
		else {
			ch-=1;
		}
		System.out.print((char)ch);
	}
}
}
