package lecture_10;

public class Array_item_index {
public static void main(String[] args) {
	int[]arr= {2,3,1,4,5,6};
	System.out.println(findIndex(arr,4));;
}
public static int findIndex(int[] arr ,int ele) {


	for(int start=0;start<arr.length;start++) {
		if(arr[start]==ele) {
		return start;
		}
		
	}
	return -1;
}
}
