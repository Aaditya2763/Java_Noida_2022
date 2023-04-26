package leetcode_pod;

public class restoreTheArray {
public static void main(String[] args) {
	String str=  "1317";
	substring(str,0,0,"");
}
public static void substring(String str,int k,int idx,String ans) {
	if(str.length()==0) {
		System.out.println(ans);
		return;
	}
char ch=str.charAt(0);
substring(str.substring(1),0,0,ans+ch);
substring(str.substring(1),0,0,ans);
	


}
}
