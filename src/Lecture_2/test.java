package Lecture_2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn=new Scanner(System.in);
	        int n=scn.nextInt();
	        int star=1;
	        int space=n+1;
	        int row=1;
	        int count=1;
	        while(row<=n){
	            int i=1;
	           while(i<=star){
	               System.out.print(count+"\t");
	               i++;
	               count++;
	           }
	            int j=1;
	            while(j<=space){
	                System.out.print(" "+"\t");
	                j++;
	            }
	            
	            int k=1;
	           
	            if(row==n) {
	            	k=2;
	            }
	            while(k<=star){
	                System.out.print(count+"\t");
	                k++;
	                count--;
	                
	            }

//	        



	            System.out.println();
	            row++;
	            space-=2;
	            star++;

	        }

	    }
	}