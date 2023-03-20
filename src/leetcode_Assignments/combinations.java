package leetcode_Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combinations {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int k=scn.nextInt();
	List<List<Integer>> res=new ArrayList<>();
	List<Integer>ll=new ArrayList<>();
	boolean [] arr=new boolean[n];
	
	combs(arr,k,0,ll, res ,0);
	System.out.println(res);
}
public static void combs(boolean[] arr,int k,int curno,List<Integer>ll,List<List<Integer>> res,int idx) {
	if(curno==k) {
		res.add(new ArrayList<>(ll));
		return;
	}
	for(int i=idx;i<arr.length;i++) {
		arr[i]=true;
		ll.add(i+1);
		combs(arr, k, curno+1, ll, res, i+1);
		arr[i]=false;
		ll.remove(ll.size()-1);
	}

}
}
