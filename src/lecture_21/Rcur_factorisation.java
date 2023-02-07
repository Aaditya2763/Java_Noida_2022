package lecture_21;

public class Rcur_factorisation {
public static void main(String[] args) {
	System.out.println(fact(5)) ;
}
public static int fact(int n) {
	
		
	if(n==1 || n==0) {
		return 1;
	}
	int fn= fact(n-1);
	return fn*n;
	}
	
	

}
