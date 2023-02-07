package lecture_21;

public class RecursionPower {
public static void main(String[] args) {
	System.out.println(power(4,5));
	
}
public static int power(int a, int b) {
	if(b==1) {
		return a;
	}
	int ans= power(a,b-1);
	return ans*a;
	
}
}
