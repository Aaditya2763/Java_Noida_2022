package bitmaskingAssignment;

import java.util.Scanner;

public class uniquenumber3 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []arr=new int [n];
    	for(int j=0;j<arr.length;j++) {
		arr[j]=scn.nextInt();
	}
    System.out.println(findunique(arr));
}
public static int findunique(int []arr) {
	int[]count=new int [32];
	for(int i=0;i<arr.length;i++) {
		int no=arr[i];
		int k=0;
		while(no>0) {
			count[k]=count[k]+(no&(1));
			k++;
			//right shift bitwise operator (divide the number)
			no=no>>1;
		}

		}
	
	int power=1;
	int ans=0;
	for(int i=0;i<32;i++) {
//		System.out.println(count[i]);
		count[i]%=3;
		ans+=count[i]*power;
				//left shift bitwise operator (multiply the number)
//		power=power<<1;
//		or
		power=power*2;
		
	}
	
	return ans;	
}

}
