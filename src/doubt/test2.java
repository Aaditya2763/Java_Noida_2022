package doubt;

import java.util.Arrays;

public class test2 {
public static void main(String[] args) {
	int []arr= {1,3,4,1,2,3,1};
	Arrays.sort(arr);
	Array2d(arr,"");
//	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]);
//	}
	
}
public static void Array2d(int []arr,String ans) {
//	System.out.println("bhdsgh");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				ans=ans+arr[i];
			}
			
		}
	}
	System.out.println(ans);
	}
}
