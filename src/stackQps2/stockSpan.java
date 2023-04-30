package stackQps2;

import java.util.Scanner;
import java.util.Stack;


public class stockSpan {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		span(arr);
	}

	public static void span(int[] arr) {
		int[] temp = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			if (st.isEmpty()) {
				temp[i] = i + 1;
			} else {
				temp[i] = i - st.peek();
			}

			st.push(i);
			
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.print("End");
		

	}
}
