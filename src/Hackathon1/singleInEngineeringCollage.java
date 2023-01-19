package Hackathon1;

import java.util.Arrays;
import java.util.Scanner;

public class singleInEngineeringCollage {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int [] trees=new int [n];
	for(int i=0;i<trees.length;i++) {
		trees[i]=scn.nextInt();
	}
	int h=scn.nextInt();
	Arrays.sort(trees);
	System.out.println(trees[0]);
	System.out.println(maxHeight(trees,h));
}
public static int maxHeight(int []arr,int height) {
	int lo=0;
	int high=arr[arr.length-1];
	int ans=0;
	while(lo<=high) {
		int mid=(lo+high)/2;
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

public static boolean isitPossible(int []arr,int mid,int height){
	int h=0;
	int pos=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]-pos>=mid) {
			pos=arr[i];
			h=h+arr[i]-pos;
		}
		if(h==height) {
			return true;
		}
	}
	return false;
}
}
