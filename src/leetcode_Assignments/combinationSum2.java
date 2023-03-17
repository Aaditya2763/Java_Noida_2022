package leetcode_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//code giving wrong ans 

public class combinationSum2 {
	
public static void main(String[] args) {
	List<List<Integer>> res=new ArrayList<>();
	List<Integer>ll=new ArrayList<>();
	int []candidates= {10,1,2,7,6,1,5};
	int target =8;
	Arrays.sort(candidates);
	combSum2(candidates, target, 0,"", res, ll,0);

	System.out.println(res);
}
public static void combSum2(int []candidates,int target,int sum,String ans,List<List<Integer>> res,List<Integer>ll,int idx) {
	if(sum==target) {
		res.add(new ArrayList<>(ll));
		return;
	}
	if(sum>target) {
		return;
	}
	
	
for(int i=idx;i<candidates.length;i++) {
	if(i!=idx && candidates[i]==candidates[i-1]) {
		continue;
	}
	ll.add(candidates[i]);
	combSum2(candidates, target, sum+candidates[i], ans+candidates[i], res, ll, i+1);
	ll.remove(ll.size()-1);
}
}
}
