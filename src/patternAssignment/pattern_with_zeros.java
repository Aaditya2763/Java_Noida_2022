package patternAssignment;

import java.util.Scanner;

public class pattern_with_zeros {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int star=1;
	int row=1;

	while(row<=n){
	    int i=1;
	    while(i<=star){
	       if(i==1 || i==row){
	        System.out.print(row+" "); 
	    }
	    else{
	       System.out.print("0"+ " ");  
	    }
	       i++;
	     
	    }
	   
	    System.out.println();
	    row++;
	     star++; 
	   
	}
	    }
	}
