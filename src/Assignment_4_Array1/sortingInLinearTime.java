package Assignment_4_Array1;

import java.util.Scanner;

public class sortingInLinearTime {
	 public static void main (String args[]) {
		 Scanner scn=new Scanner(System.in);
			 int n=scn.nextInt();
//					int [] arr= {5,4,3,2,1};
			 int [] arr= new int [n];
			 for(int i=0;i<arr.length;i++) {
				 arr[i]=scn.nextInt();
			 }
			Sorting(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		public static void Sorting(int []arr) {
			
			for (int i = 1; i < arr.length; i++) {
					int item = arr[i];
					int j = i - 1;
					while (j >= 0 && arr[j] > item) {
						arr[j + 1] = arr[j];
						j--;
					}
					arr[j + 1] = item;
				}
				
			}
		}


