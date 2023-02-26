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
	//extracting 0th character
	char ch=ques.charAt(0);
	//getting element from  array
	String key=arr[ch-'0'];
	for(int i=0;i<key.length();i++) {
		print(ques.substring(1),ans+key.charAt(i));
	}
}
}
