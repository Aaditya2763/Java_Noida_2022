package Lecture24;

public class stringPermutation {
public static void main(String[] args) {
	String  str="abc";
	String ans="";
	printAnswer(str, ans);
}
public static void printAnswer(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
	}
	for(int i=0;i<ques.length();i++) {
		char ch=ques.charAt(i);
		String s1=ques.substring(0,i);
		String s2=ques.substring(i+1);
		printAnswer(s1+s2, ans+ch);
	}
}

}
