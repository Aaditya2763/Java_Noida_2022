package Assignment_5_String;

public class playingWithgoodString {
public static void main(String[] args) {
	String str="cbaeicde";
	System.out.println(count(str));
}
public static boolean  isVowel(char ch) {

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;

	}
	return false;
}
public static int count(String str) {
	int ans=0;
	int count=0;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(isVowel(ch)) {
			count++;
		}
		else {
			ans=Math.max(ans,count);
			count=0;
		}
	}
	ans=Math.max(ans, count);
	
	return ans;
}
}
