package Lecture_2;

import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        int a =sc.nextInt();
	        int dig;
	        int count=0;
	        while(n>0){
	            dig=n%10;
	            n=n/10;
	            if (dig==a){
	                count++;

	            }
	        }
	        System.out.println(count);
		

	}

}
