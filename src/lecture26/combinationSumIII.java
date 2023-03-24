package lecture26;

import java.util.ArrayList;
import java.util.List;

public class combinationSumIII {
 public static void main(String[] args) {
	 List<List<Integer>> res=new ArrayList<>();
		List<Integer>ll=new ArrayList<>();
		int target =7;
	int k=3;
Sum(target, 0,k,ll,res, 1);
	 }
 public static void Sum(int target,int curSum,int k,List<Integer>ll,List<List<Integer>> res,int idx) {
	 if(k==0 ) {
		 int sum=0;
		 for(int val:ll) {
			 sum+=val;
		 }
		 if(sum==target) {
			 System.out.println(ll);
		 }
		
		 return;
	 }
	 for(int i=idx;i<=target;i++) {
		 ll.add(i);
		 Sum(target, curSum+i, k-1, ll,res, i+1);
		 ll.remove(ll.size()-1);
	 }
	 
 }
 }

