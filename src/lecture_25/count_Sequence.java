
package lecture_25;

public class count_Sequence {
public static void main(String[] args) {
	String ques="abc";
	String ans="";
	System.out.println("\n"+SubSec(ques, ans));
}
static int count=0;
public static int SubSec(String ques,String ans) {
	if(ques.length()==0) {
		System.out.print(ans+" ");
		return 1;
	}
	char ch=ques.charAt(0);
	int a1=SubSec(ques.substring(1), ans);
	int a2=SubSec(ques.substring(1), ans+ch);
	return a1+a2;
}
}
