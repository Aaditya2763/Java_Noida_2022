package stackQps2;

import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
//	int []arr= {11,9,13, 21, 3};
	int n=scn.nextInt();
	while(n>0) {
		int x=scn.nextInt();
		int []arr=new int[x];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		NGE(arr);
		n--;
	}
	
}
public static void NGE(int []arr) {
	int []temp=new int [arr.length];
	Stack<Integer> st=new Stack<Integer>();
	
	for(int i=0;i<arr.length;i++) {
		while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
			
			int popedData=st.pop();
			temp[popedData]=arr[i];
		}
		st.push(i);
	}
	while(!st.isEmpty()) {
		temp[st.pop()]=-1;
	}
	for(int i=0;i<temp.length;i++) {
		System.out.println(arr[i]+","+temp[i]);
	}
}
}
