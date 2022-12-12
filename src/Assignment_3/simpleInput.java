package Assignment_3;

import java.util.Scanner;

public class simpleInput {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int sum=0;
	while(true){
		int n=scn.nextInt();
		if(sum+n<=0) {
			break;
		}
		
		System.out.println(n);
		sum+=n;
		
	}
}
}
