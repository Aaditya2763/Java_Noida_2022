package lecture_10;

public class rotate_doubt {
public static void main(String[] args) {
	class Solution {
	    public void rotate(int[] nums, int k) {
	rotate1(nums,k);
	    }
	    public int [] rotate1(int[]arr,int k) {
		k=k%arr.length;
		int temp=arr[arr.length-1];
	//	
//		for(int i=arr.length-2;i>=0;i--) {
//			arr[i+1]=arr[i];
//		}
	k=k+1;
	while(k-->0){
	    
		int i=1;
		while(i<arr.length) {
		int val=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=val;
//	 		System.out.println(arr[i]);
			i++;
			
		}
	// arr[0]=temp;	
	    
	}
	  return arr ;
	}
	  
	} 
}
}
