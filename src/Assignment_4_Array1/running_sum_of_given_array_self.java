package Assignment_4_Array1;

import java.util.Scanner;

public class running_sum_of_given_array_self {
public static void main(String[] args) {

//	Scanner scn=new Scanner(System.in);
//	int n= scn.nextInt();
//	int []arr=new int [n];
//	 for(int i=0;i<arr.length;i++) {
//		 arr[i]=scn.nextInt();
//	 }
	int []arr= {1,2,3,4};
RunningElementSum(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}

}
public static  int [] RunningElementSum (int []arr) {
	//My mistake is i am trying to make changes in current array.it will leads to give incorrect answer after adding the array elements.
	//eg. [1 ,1+2, 1+3+3 ,1+3+7+4]
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=0;j<=i;j++) {
			sum=sum+arr[j];
			//System.out.println("hello"+j);
		}
		arr[i]=sum;
		
		
	}
	return arr;
}

}
