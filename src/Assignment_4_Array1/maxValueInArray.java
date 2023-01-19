package Assignment_4_Array1;

import java.util.Scanner;

public class maxValueInArray {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
    int n =scn.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
  
 System.out.println(maxElement(arr));
    }

    public static int maxElement(int []arr){
    	int max=arr[0];
     for(int i=0;i<arr.length;i++){
         if(arr[i]>=max){
            max=arr[i];
         }
     }
     return max;
}
}
