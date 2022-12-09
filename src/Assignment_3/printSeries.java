package Assignment_3;

import java.util.Scanner;

public class printSeries {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n1=scn.nextInt();
	int n2=scn.nextInt();
	int i=1;
while(n1>0) {
	if((3*i+2)%n2!=0) {
		System.out.println(3*i+2);
		n1--; //here if we interchange the n1 and i we get only one output because i becomes
		//i=2 and it is divisible by n2 and we have to decrease the value of n1 only when ((3*i+2)%n2!=0)
	}
	i++;
}
	
	}
}

