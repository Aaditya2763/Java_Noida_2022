package Assignment_4_Array1;

import java.util.Scanner;

public class Kthroot {
	 public static void main(String args[]) {
	        // Your Code Here
	       Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        while(T>0) {
	        	long N=sc.nextLong();
	        	long K=sc.nextLong();
	        	 kthroot(N,K);
	        	T--;
	        }
	        
	     
	       
	  }
	   public static void kthroot(long N, long k){
		long low=0;
		long high =N;
		long ans=0;
		while(low<=high) {
		long mid=low+(high-low)/2;
		if(Math.pow(mid,k)<=N) {
			ans=mid;
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		}
		 System.out.println(ans);
		
		   
	   }}