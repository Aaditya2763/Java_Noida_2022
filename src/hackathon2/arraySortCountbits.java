package hackathon2;

import java.util.Arrays;

public class arraySortCountbits {
public static void main(String[] args) {
	int []arr= {0,1,2,3,4,5,6,7,8};
//	011212231
	int n=5;
	
	
		int[]ans=countBits(arr);
	for(int i=0;i<arr.length;i++) {

		System.out.print(ans[i]);
	}
}
public static int [] countBits(int []arr) {
	int[] temp= new int [arr.length];

	for (int i=0;i<arr.length;i++) {
		int count=0;
		int n=arr[i];
	
		while(n!=0) {
			n=n&(n-1);
			count++;
		}
		temp[i]=count;
	
				}
	for(int i=0;i<arr.length;i++) {
		
//System.out.print(temp[i]);
//System.out.println();
	}
swap(arr,temp);
	
	
	
//	Arrays.sort(temp);
	return arr;
	
}
public static void swap(int[]arr,int[]temp) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
//			System.out.println("i "+arr[i]+"j "+arr[j]);
			if(temp[i]>temp[j]){
				int k=arr[i];
				arr[i]=arr[j];
				arr[j]=k;
				i=i+1;
				
			}
		}
	}
}
}
