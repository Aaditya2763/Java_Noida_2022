package lecture_8;

import java.util.Scanner;

public class Inverse_of_number {
public static  void  main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int sum =0;
	int pos=1;
	
	while(n>0) {
		
		int rem=n%10;
		//power gives double type value thats why we have to typecast it into int 
		 sum=(int)(sum+pos*Math.pow(10, rem-1));
		pos++;
		n=n/10;
		
	}
	System.out.println(sum);
}
}
