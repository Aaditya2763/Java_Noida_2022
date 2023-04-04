package doubt;

import java.util.Scanner;

public class TEST {
	
	public static void main(String[] args) {
//		
	int []nums1= {6,1,4,3,2};
	int []nums2= {2,1,5};
//System.out.println(SmallestNum(nums1,nums2));
System.out.println(sameEle(nums1, nums2));
	}
	public static int SmallestNum(int []arr1,int[] arr2) {
		int smallnum1=arr1[0];
		int smallnum2=arr2[0];
		String ans="";
		int same=sameEle(arr1, arr2);
		for(int i=1;i<arr1.length;i++) {
			if(arr1[i]<smallnum1) {
				smallnum1=arr1[i];
//				System.out.println(smallnum1);
//				return smallnum1;
			}
		}
		for(int i=1;i<arr2.length;i++) {
			if(arr2[i]<smallnum2) {
				smallnum2=arr2[i];
//				System.out.println(smallnum2);
//				return smallnum2;
			}
		}
//		
//		
//		for(int i=0;i<arr2.length;i++) {
//			if(arr1[i]==arr2[i]) {
//				return arr1[i];
////				System.out.println(smallnum2);
////				return smallnum2;
//			}
//		}
		ans=smallnum1+""+smallnum2;
		int ans2=Integer.parseInt(ans);
//		System.out.println(ans2);
//		if(smallnum1==smallnum2) {
//			return  smallnum1;
//		}
		
		
		return same>0?same:ans2;
		
	}
	public static int sameEle(int []arr1,int []arr2) {
		int ans=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]<=arr2[j]&&arr1[i]==arr2[j]) {
					ans=arr1[i];
				}
			}
		
		}
		return ans ;
	}
     
}
