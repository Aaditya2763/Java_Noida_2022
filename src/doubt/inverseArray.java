package doubt;

import java.util.Scanner;

public class inverseArray {

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
//	int n= scn.nextInt();
//	int []arr=new int [n];
//	 for(int i=0;i<arr.length;i++) {
//		 arr[i]=scn.nextInt();
//	 }
	int n=5;
	int []arr= {0,2,4,1,3};
	int []ans=Inverse(arr);
//Inverse(arr);
for(int i=0;i<ans.length;i++) {
	//System.out.println(ans[i]);
}

}
public static int [] Inverse(int []arr) {
	int []ans =new int[arr.length];
	//System.out.println(ans.length);
	
	 for(int i=0;i<ans.length;i++) {
  ans[arr[i]]=i;
	System.out.println(ans[i]);
	 }
	return ans;
}

}
