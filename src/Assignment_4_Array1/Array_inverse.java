package Assignment_4_Array1;

import java.util.Scanner;

public class Array_inverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}

//	int n=5;
//	int []arr= {0,2,4,1,3};
	Inverse_Array(arr);
}
public static void Inverse_Array(int[] arr) {
	int[] result = new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		result[arr[i]] = i;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(result[i] + " ");
	}
}

}
