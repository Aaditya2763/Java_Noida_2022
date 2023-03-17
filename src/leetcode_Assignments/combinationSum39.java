package leetcode_Assignments;

import java.util.ArrayList;
import java.util.List;

public class combinationSum39 {
public static void main(String[] args) {
	int []candidates= {2,3,6,7};
	int target=7;
	List<Integer>ll=new ArrayList<>();
List<List<Integer>>res=new ArrayList<>();
	combSum(candidates, 0, target, "",0,ll,res);
	System.out.println(res);
}
public static void combSum(int []candidates,int sum,int target,String ans,int idx,List<Integer>ll,List<List<Integer>>res) {
	if(sum==target) {
		res.add(new ArrayList<>(ll));
		return;
		
	}
	if(sum>target) {
		return;
	}
	for(int i =idx;i<candidates.length;i++) {
	// we are adding ith index 
		ll.add(candidates[i]);
		combSum(candidates, sum+candidates[i], target, ans+candidates[i],i,ll,res);
	//we are removing last added element from the list 
		//because recursion can't undo itself in this question 
		//because changes took place in  heap
		ll.remove(ll.size()-1);
	}
	
}
}
