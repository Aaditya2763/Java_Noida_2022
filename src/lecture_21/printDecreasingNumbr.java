package lecture_21;

public class printDecreasingNumbr {
public static void main(String[] args) {
	decNum(5);
}
public static void decNum(int n) {
	if(n==0) {
		return;
	}
	System.out.println(n);
		decNum(n-1);
//		System.out.println(n);
	
	
	
}
}
