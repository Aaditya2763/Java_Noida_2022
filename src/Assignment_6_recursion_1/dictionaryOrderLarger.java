package Assignment_6_recursion_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dictionaryOrderLarger {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
//	String ques=scn.next();
	String ques="abc";
	ArrayList<String> ll=new ArrayList<String>();
	larger(ques,ques, "",ll);
	Collections.sort(ll);
	for(int i=0;i<ll.size();i++) {
		System.out.println(ll.get(i));
	}
//	String a="a";
//	String b="r";
//System.out.println(a.compareTo(b));

}
public static void larger(String ques,String org,String ans,ArrayList<String>ll) {
	if(ques.length()==0) {
		//ans-org=integervalue
		if(ans.compareTo(org)>0)
//		System.out.println(ans+" ");
		ll.add(ans);
		return;
	}
	 for(int i=0;i<ques.length();i++) {
	 char ch=ques.charAt(i);

	 String ros=ques.substring(0,i)+ques.substring(i+1);
	larger(ros,org, ans+ch,ll);
	 
	 }
}
}
