package Hackathon1;

import java.util.Arrays;
import java.util.Scanner;

public class singleInEngineeringCollage {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	long []trees=new long[n];
	for(int i=0;i<trees.length;i++) {
		trees[i]=scn.nextLong();
	}
	int h=scn.nextInt();
	Arrays.sort(trees);
//	System.out.println(trees[0]);
	System.out.println(maxHeight(trees,h));
}
public static long maxHeight(long[]arr,long height) {
	long lo=1;
	long high=arr[arr.length-1];
	long ans=0;
	while(lo<=high) {
		long mid=((lo+high)/2);
	if(isitPossible(arr,mid,height)){
		ans=mid;
		lo=mid+1;
	}
	else {
		high=mid-1;
	}
	}
	return ans;
}

public static boolean isitPossible(long []arr,long mid,long height){
	long temp=0;
//	int pos=arr[0];
	for(int i=0;i<arr.length;i++) {
		
			if(arr[i]>mid) {
				temp=temp+(arr[i]-mid);
		}
		if(temp>=height) {
			return true;
		}
	}
	return false;
}
}
