package Assignment_3;

import java.util.Scanner;

public class print_prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int counter;
		for(int j=2;j<=n;j++){
	         counter=0;
	         for(int i=2;i<=j;i++){
	            if(j%i==0){
	               counter++;
	            }
	         }
	         if(counter==1)
	         System.out.println(j+" ");
	      }
	
		 
	}
}
