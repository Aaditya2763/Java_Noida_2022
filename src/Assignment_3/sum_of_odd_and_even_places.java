package Assignment_3;

import java.util.Scanner;

public class sum_of_odd_and_even_places {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int evenSum=0;
	  int oddSum=0;
	  int pos=1;// what is the difference if we write this pos here or we write the pos at line 16.
  while(num>0) {
  //getting first digit of number
	  
	  int lastDigit=num%10;
//	  num=num/10;
//  pos++;
	  if(pos%2==0){
		  evenSum+=lastDigit;
		 
	  }
	  else {
		  oddSum+=lastDigit;
	
		
	  }
	  num=num/10;  //   if i write this code here
       pos++;    // unable to submit on hackerblock
	 
	  
	  
	 
  }
  System.out.println(evenSum);
  System.out.println(oddSum);
 
	
	
}
}
