package lecture_26;

public class letterCombination {
static String []arr ={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
public static void main(String[] args) {
	String ques="189";
	print(ques,"");
}
public static void  print(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans+" ");
		return;
	}
	//extracting 0th character i.e 1 and ascii value is 49
	//ascii value of 0 is 48.
	//so when we subtract ch-'0' we get the integer value of ch
	char ch=ques.charAt(0);
//	System.out.println((int)ch);
	//getting element from  array
	
	String key=arr[ch-'0'];
	for(int i=0;i<key.length();i++) {
		print(ques.substring(1),ans+key.charAt(i));
	}
}
}
