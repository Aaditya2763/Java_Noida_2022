package leetcode_pod;

public class AddDigits {
public static void main(String[] args) {
	System.out.println(addDigits(10));
}
public static int addDigits(int num) {
	int n=0;
	  while(num>9) {
		  n=num;
		  num=0;
		  while(n>0) {
			  num=num+n%10;
			  n=n/10;
		  }
	  }
	    
    return num;
}
}
