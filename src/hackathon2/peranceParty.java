package hackathon2;

import java.util.Scanner;

public class peranceParty {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int[] arr=new int [n];
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
	}
	maxPair(arr);
}
public static void maxPair(int []arr) {
int i=0;
int j=arr.length-1;
int ans=0;
while(i<arr.length && j>0) {
	int p1=Math.min(arr[i],arr[i+1]);
//	System.out.println("p1=="+p1);
	int p2=Math.min(arr[j],arr[j-1]);
//	System.out.println("p2=" +p2);
	int sum=p1+p2;
//	System.out.println("sum=="+sum);
	ans=Math.max(ans, sum);
//	System.out.println("ans==="+ans);
	i++;
	j--;
}
System.out.println(ans);
}
}
