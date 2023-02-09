package Assignment_4_Array1;

import java.util.Arrays;
import java.util.Scanner;

public class pairOfRoses {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-->0){
         int n =sc.nextInt();
         int[]arr = new int[n];
         for(int i =0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int target=sc.nextInt();
         Roses(arr,target);
     }
   }
   public static void Roses(int []arr,int target){
	        Arrays.sort(arr);
	        int i = 0;
	        int j = arr.length-1;
	        int a = 0;
	        int b=0;
	        while(i<j){
	            if(arr[i]+arr[j]==target){
	               a = i;
	               b = j;
	               i++;
                  j--;
	            }else  if (arr[i]+arr[j]>target){
	                j--;
	            }else{
	                i++;
	            }
	        }
	        if(arr[a]>arr[b]){
	        	System.out.println("Deepak should buy roses whose prices are "+arr[b]+" and "+arr[a]+".");
	        }else {
	            System.out.println("Deepak should buy roses whose prices are "+arr[a]+" and "+arr[b]+".");
	        }
   }
}
