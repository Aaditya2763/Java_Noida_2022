package doubt;

import java.util.Arrays;

public class test2 {
public static void main(String[] args) {
	int n=15;
	
}
public static int step(int n,int curStep,int ans) {
	if(n==0) {
	return ans;
	}
	int s1=step(n-1, curStep+1,ans+1);
	if(n%2==0) {
		int s2=step(n-n/2, curStep+n/2,ans+n/2);	
	}
	
	if(n%3==0) {
		int s2=step(n-n/3, curStep,ans+n/3);	
	}
	
}
}
