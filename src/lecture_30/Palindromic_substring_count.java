package lecture_30;

public class Palindromic_substring_count {
public static void main(String[] args) {
	String str="nitin";
	System.out.println(count(str));
}
public static int count(String str) {
	int count=0;
	//odd
	for(int axis=0;axis<str.length();axis++) {
		for(int orbit=0;orbit<str.length() && axis-orbit>=0 && axis+orbit<str.length();orbit++) {
			if(str.charAt(axis-orbit)!=str.charAt(axis+orbit)) {
				break;
			}
			count++;
		}
		
	}
	//even
	for(double axis=0.5;axis<str.length();axis++) {
		for(double orbit=0.5;orbit<str.length()&&axis-orbit>=0 && axis+orbit<str.length();orbit++) {
			if(str.charAt((int)(axis-orbit))!=str.charAt((int)(axis+orbit))) {
				
			}
		}
	}
	return count;
}
}
