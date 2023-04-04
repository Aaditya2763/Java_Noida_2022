package doubt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test3 {
public static void main(String[] args) {
	int []nums= {-1,0,1,2,-1,-4};
	System.out.println(threeSum(nums));;
}
public static  List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
     List<List<Integer>>res=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
    	 if(i != 0 && nums[i] == nums[i-1]){
             continue;
}
         int j=i+1;
         int k=nums.length-1;
         while(j<=k){
        	
             int sum=nums[i]+nums[j]+nums[k];
             if(sum==0){
                  List<Integer> ll=new ArrayList<>(); 
//                 ll.add(nums[i]);
//                  ll.add(nums[j]);
//                   ll.add(nums[k]);
//                   res.add(new ArrayList<>(ll));
                  while(j<k && nums[j]==nums[j+1]) {
                	   j++;
                   }
                 
                  System.out.println(i+" "+j+" "+k);
             }

             else if(sum>=0){
                 k--;
             }
             else{
                 j++;
             }
         }
     }
     return res;
 }
}
