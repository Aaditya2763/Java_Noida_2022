package Assignment_4_Array1;

import java.util.Scanner;

public class calculateTheSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while(q-- > 0) {
			int x = sc.nextInt();
			countSum(arr,x);
			
			
		}
	}
	public static void countSum(int []arr,int n) {
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int t = i-n;
			if(t < 0) {
				
				t += arr.length;
			}
			
			temp[i] =arr[i]+ arr[t];
			System.out.println(temp[i]);
		}
	}
}