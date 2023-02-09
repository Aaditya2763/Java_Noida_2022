package Assignment_4_Array1;

import java.util.Scanner;

public class alexGoesShopping {
	
	    public static void main(String args[]) {
	               Scanner sc=new Scanner(System.in);  
	        int n=sc.nextInt();  
	        int[] prices = new int[n];
	        for(int i=0;i<n;i++){
	            int ele=sc.nextInt();
	            prices[i]=ele;
	        }
	        
	        int q=sc.nextInt();
	        while(q>0){
	            int a,k;
	            a=sc.nextInt();
	            k=sc.nextInt();
	            for(int i=0;i<n;i++){
	                if(a%prices[i]==0){
	                    k--;
	                }
	            }

	            if(k<=0){
	                System.out.println("Yes");
	            }
	            else{
	                System.out.println("No");
	            }
	            q--;
	        }

	    }
	}

