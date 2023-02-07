package lecture20;

public class magicNumber {
public static void main(String[] args) {
	System.out.println(nthMagicNum(11));
}
public static int nthMagicNum(int n) {
	int ans=0;
	int mul=5;
	while(n!=0) {
		if((n&1)!=0) {
			ans=ans+mul;
		}
		mul=mul*5;
		n>>=1;
	}
	return ans;

}
}
