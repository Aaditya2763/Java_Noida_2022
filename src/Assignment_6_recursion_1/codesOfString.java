package Assignment_6_recursion_1;

import java.util.ArrayList;

public class codesOfString {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	String ques="1125";
	PrintString(ques, "",list);
	System.out.println(list);
}
 public static void PrintString(String Ques,String ans,ArrayList<String>list) {
	 if(Ques.length()==0) {
		 
//		 System.out.println(ans+" ");
		 list.add(ans);
		 
		 return;
		 
	 }
	 char ch=Ques.charAt(0);
	 PrintString(Ques.substring(1), ans+(char)(ch+48),list);
	
	if(Ques.length()>=2) {
 String s1=Ques.substring(0,2);
 int num= Integer.parseInt(s1);

 if(num<=26) {
	 PrintString(Ques.substring(2), ans+(char)(num+96),list);
 }
 
	}
 }
}
