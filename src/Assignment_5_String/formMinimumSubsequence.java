package Assignment_5_String;

import java.util.Scanner;

public class formMinimumSubsequence {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String[] arr = new String[n];
			for (int i = 0; i < arr.length; i++)
			{
				arr[i] = sc.next();
			}
			for (int i = 0; i < arr.length; i++)
			{
				System.out.println(minimum_number(arr[i]));
				
			}
			
		}

		public static String minimum_number(String s)
		{
			String ans="";
	        int size=s.length()+1;
			int[] array = new int[size];
			for (int i = 0; i < array.length; i++)
			{
				array[i]=i+1;
			}
			
			for(int i=0;i<s.length();i++)
			{
				int temp=i;
				while(temp<s.length() && s.charAt(temp)=='D')
				{
					temp++;
				}
				
				reverse(array,i,temp);
				
				if(temp!=i)
				{
					i=temp-1;
				}
				
			}
	        for(int i=0;i<array.length;i++)
	        {
	            ans+=array[i];
	        }
			return ans;
		}
		public static void reverse(int[] array, int i, int j)
		{
			while(i<j)
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
		}
}
