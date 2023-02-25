package lecture_25;

public class rolldice {
public static void main(String[] args) {
	String ans="";
	int cur=0;
	System.out.println("\n"+countAndPrintDice(cur,4, ans));
}
public static int countAndPrintDice(int cur,int target,String ans) {
	if(cur==target) {
		System.out.print(ans+" ");
		return 1;
	}
	if(cur>target) {
		return 0;
	}
	
int a1=countAndPrintDice(cur+1,target,ans+1);
int a2=countAndPrintDice(cur+2,target, ans+2);
int a3=countAndPrintDice(cur+3,target, ans+3);
		return a1+a2+a3;
}
}
