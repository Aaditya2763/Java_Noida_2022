package Lecture_32;

public class Prime_Seive {
	public static void main(String[] args) {
		int n=100; 
		PrimeSeive(n);
	}
	public static void PrimeSeive(int n) {
		boolean[]prime=new boolean[n+1];    
		prime[0]=true; // prime number nahi hai
		prime[1]=true;// prime number nahi hai
		//create a matrix and then dry run for proper explantion
		for(int i=2;i*i<prime.length;i++) {
			if(prime[i]==false) {
				for(int j=2;j*i<prime.length;j++) {
					prime[j*i]=true; // marked prime no nahi hai
				}
			}
		}
		for(int i=0;i<prime.length;i++) {
			if(prime[i]==false) {
				System.out.println(i+" ");
			}
		}
	}
}
