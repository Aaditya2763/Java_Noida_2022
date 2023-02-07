package lecture23;

public class coinTossWithout2Heads {

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

if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
	toss(n-1,ans+"H");
}
	
	toss(n-1,ans+"T");  
}
}
