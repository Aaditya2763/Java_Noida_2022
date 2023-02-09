package doubtClass2;


import java.util.*;
//this question contains dnf algo
public class sortinginLInearTime {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int[]arr=new int [n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
	}
	Sort(arr);	
}
public static void Sort(int []arr) {
	int i=0;
	int l=0;//sorting for 0
	int r=arr.length-1; //sorting for 2
	while(i<=r) {
		if(arr[i]==0) { 
			// this part is confusing for example 202110
			//because after swapping i and l have the same value 
			//and swapping doesn't change anything 
			//try with this example 2021101 
			//you will understand why we are swapping here;
			int temp=arr[i];
			arr[i]=arr[l];
			arr[l]=temp;
			i++;
			l++;
		}
		else if(arr[i]==2) {
			int temp=arr[i];
			arr[i]=arr[r];
			arr[r]=temp;
			r--;
		}
		else {
			i++;
		}
	}
    for(int k=0;k<arr.length;k++){
 System.out.print(arr[k]+" ");
    }
   
}
}
