package Assignment_6_recursion_1;

import java.util.ArrayList;

public class leetcode_lexoCounting {
public static void main(String[] args) {
	ArrayList<Integer>ll=new ArrayList<Integer>();
	for(int i=1;i<=9;i++) {
		count(i,13,ll);
	}
	System.out.println(ll);
	
}
public static void count(int cur,int n,ArrayList<Integer>ll) {
	if(cur>n) {
		return;
	}
//	System.out.println(cur);
	ll.add(cur);
	for(int i=0;i<=9;i++) {
		count(cur*10+i, n,ll);
	}
}
}
