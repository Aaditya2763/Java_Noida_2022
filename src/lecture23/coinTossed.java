package lecture23;

public class coinTossed {
public static void main(String[] args) {
	int n=3;
	toss(n,"");
}
public  static void toss(int n,String ans) {

	if(n==0) {
		if(ans.contains("HH")) {
			
		}
		else {
			System.out.println(ans+"");
		}
		
		return;
	}
//	char head='H';d
//	char tail='T';

	toss(n-1,ans+"H");
	toss(n-1,ans+"T");
}
}
