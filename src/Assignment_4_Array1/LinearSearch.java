package Assignment_4_Array1;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
    int n =scn.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    int ele=scn.nextInt();
 System.out.println(Linear_Search(arr,ele));
    }

    public static int Linear_Search(int []arr,int ele){
     for(int i=0;i<arr.length;i++){
         if(arr[i]==ele){
             return i;
         }
     }
     return -1;
}
}
