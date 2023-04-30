package stackQps2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
//1 2 1 4 5
public class Histogram {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scn.nextInt();
	}
	System.out.println(maximumArea(arr));
}
public static int maximumArea(int[]arr) {
	Stack<Integer>st=new Stack<>();
	int ans=0;
	for (int i = 0; i < arr.length; i++) {
		while(!st.isEmpty() && arr[i]< arr[st.peek()]) {
			int r=i;;
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				int area=h*r;
				ans=Math.max(ans, area);
			}
			else {
				int l=st.peek();
				int area=h*(r-l-1);
				ans=Math.max(ans, area);
				
			}
		}
		st.push(i);
		
	}
	int r = arr.length;
	while (!st.isEmpty()) {

		int h = arr[st.pop()];
		if (st.isEmpty()) {
			int area = h * r;
			ans = Math.max(ans, area);
		} else {
			int l = st.peek();
			int area = h * (r - l - 1);
			ans = Math.max(ans, area);
		}
	}
	return ans;
	
}
}
