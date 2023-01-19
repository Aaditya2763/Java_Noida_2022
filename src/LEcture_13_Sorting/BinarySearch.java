package LEcture_13_Sorting;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	// int []arr= {2,34,5,7,9,10,20,30,40};
		// int target=20;
	    Scanner scn=new Scanner(System.in);
	    // n is the size of array
	    int n=scn.nextInt();	    
	    int []arr=new int[n];
	    
	    //loop for place elements in array
	    for(int i=0;i<arr.length;i++){
	        arr[i]=scn.nextInt();
	    }
	    //target for elemext taht w
	    int target=scn.nextInt();
		System.out.println(BinarySearch(arr,target));
	}
	public static int BinarySearch(int [] arr,int  target) {
		
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			//always remember integer overflow concept
			//int mid =low+(high-low)/2;
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low=mid+1;
			
			}
			else if(arr[mid]>target) {
				high=mid-1;
			}
		}
		return-1;
	}
}