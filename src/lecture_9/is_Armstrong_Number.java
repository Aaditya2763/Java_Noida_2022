package lecture_9;

import java.util.Scanner;

public class is_Armstrong_Number {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	
	System.out.println(isArmstrong(num));;
}

public static boolean isArmstrong(int n) {
	int count =Count(n);
	int temp=n;
	int sum=0;
	while(n>0){
		int rem=n%10;
		sum= (int) (sum+Math.pow(rem,count));
		n=n/10;
		
	}
	return sum==temp;
	
	
}
public static int Count(int n) {
	int count=0;
	while(n>0) {
		n=n/10;
		count++;
	}
	return count;
}
}
