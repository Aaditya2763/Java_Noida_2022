package Assignment_6_recursion_1;

import java.util.Iterator;
import java.util.Scanner;

public class countReplaceAndRemoveHi {
public static void main(String[] args) {
	String str="abchibi";
	Scanner scn=new Scanner(System.in);
//	String str=scn.next();
System.out.println(CountremoveHi(str,""));
removeHi(str, "");
}  
 public static int CountremoveHi(String ques,String ans) {
	 int a1=0;
	 if(ques.length()==0){

		return 1; 
	 }
	
	
	 if(ques.length()>=2 && ques.charAt(0)=='h'&& ques.charAt(1)=='i') {
		
		 a1=a1+CountremoveHi(ques.substring(2), ans+"bye");
		

		}
	 else {
		a1=a1+CountremoveHi(ques.substring(1), ans+ques.charAt(0));
	 }
	
	return a1;
 }
 public static void removeHi(String ques,String ans) {
	 int a1=0;
	 if(ques.length()==0){
		System.out.println(ans+" ");
		return ; 
	 }
	
	
	 if(ques.length()>=2 && ques.charAt(0)=='h'&& ques.charAt(1)=='i') {
		removeHi(ques.substring(2), ans);
		removeHi(ques.substring(2), ans+"bye");
		

		}
	 else {
		removeHi(ques.substring(1), ans+ques.charAt(0));
	 }
	
	
 }
}
