package Lecture_1;

public class Sumoffirst5naturalnumbers {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int sum=0;
//		for(int i=1;i<=5;i++) {
//			sum +=i;
//		}
//		System.out.println( "The Sum of first five natural numbers is "+sum);
		
		
		int i=1;
		int n=6;
		int count=0;
		
		while(i<=n) {
			count=count+i;
			i++;
		}
		System.out.println(count);

	}

}	