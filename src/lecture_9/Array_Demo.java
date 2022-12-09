package lecture_9;

import java.util.Scanner;

public class Array_Demo {
public static void main(String[] args) {
	//continuous data stored in array
	///it is a non primitive data type
	//primitive data types stored in Stack memory and non-primitive data types are stored in Heap memory
	//in non primitive data types
    // variable store in Stack memory and value store in heap memory.
	// when we print array it gives us hash value regarding array.
	//in array indexing starts from 0 to n-1;
	//Array is static in nature with respect to memory
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int a;
	int[]arr=new int[n];// java type array
	int ar[]=new int [n]; //c type array
	for(int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
	}
	Display(arr);
}
public static void Display(int []arr) {
	for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
