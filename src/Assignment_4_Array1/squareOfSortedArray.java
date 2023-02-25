
package Assignment_4_Array1;


import java.util.Arrays;

public class squareOfSortedArray {
public static void main(String[] args) {
	int [] arr= {5,4,-3,2,-1};
	int [] ans =Square(arr);
	Arrays.sort(ans);
	for(int i=0;i<arr.length;i++) {
		System.out.print(ans[i]+" ");
	}

}
public static int[] Square(int []arr) {
	int[]ans=new int [arr.length];
	 for(int i=0;i<arr.length;i++) {
		 ans[i]=arr[i]*arr[i];
//		 System.out.println(ans[i]); n o\l
	
	 } 
	return ans;

}
}
