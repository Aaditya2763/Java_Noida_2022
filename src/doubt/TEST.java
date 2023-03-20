package doubt;

import java.util.Scanner;

public class TEST {
	static boolean  f = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ]arr= {2,4,6};
		   subsets(arr);
	}
	public static void subsets(int []arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
     
}
