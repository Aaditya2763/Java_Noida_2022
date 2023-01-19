package Assignment_4_Array1;

public class binarySearch {
public static void main(String[] args) {
	int []arr= {2,34,5,7,9,10,20,30,40};
	int target=20;
	System.out.println(BinarySearch(arr,target));
}
public static int BinarySearch(int [] arr,int  target) {
	
	int low=0;
	int high=arr.length-1;
	while(low<high) {
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
