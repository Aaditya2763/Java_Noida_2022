package lecture27;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Palindrome_partitioning {
public static void main(String[] args) {
	String ques="nitin";
	List<String>list=new ArrayList<>();
	List<List<String>>ans= new ArrayList<>();
	Partitioning(ques,list,ans);
	System.out.println(ans);
}
public static void Partitioning(String ques,List<String> list,List<List<String>>ans) {
	if(ques.length()==0) {
//		System.out.println(list);
		//
		ans.add(new ArrayList<>(list));
		return;
	}
	for(int i=1;i<=ques.length();i++) {
		String s=ques.substring(0,i);
		if(isPalindrome(s)) {
			list.add(s);
			Partitioning(ques.substring(i),list,ans);
			// we are using backtracking here because simple recursion can't undo changes took place in heap
			list.remove(list.size()-1);
			
		}
	
	}
}
public static boolean isPalindrome(String ans) {
	int i=0;
	int j=ans.length()-1;
	while(i<j) {
		if(ans.charAt(i)!=ans.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}
