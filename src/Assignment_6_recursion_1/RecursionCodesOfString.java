package Assignment_6_recursion_1;

public class RecursionCodesOfString {
static String []arr ={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
public static void main(String[] args) {
	String str="189";
	combination(str,"");
	
}
public static void combination(String str,String ans) {
	
	if(str.length()==0) {
		System.out.println(ans);
		return;
	}
	char ch=str.charAt(0);
	//ASCII value of 0 is 48 and ASCII value of 1 is 49;
	// ch-'0' will give 1;
	String stringAtindexCh=arr[ch-'0'];
	for(int i=0;i<stringAtindexCh.length();i++) {
		combination(str.substring(1), ans+stringAtindexCh.charAt(i));
	}

}
}
