package Assignment_6_recursion_1;

public class Recursion_Nth_Triangle {
public static void main(String[] args) {
	int n=4;
	System.out.println(Triangle(n));
}
public static int Triangle(int n) 
		{
		     if(n==0) {
		    	 return 0;
		     }
		     int sum=  n +Triangle(n-1);  
return sum;
		}
}
