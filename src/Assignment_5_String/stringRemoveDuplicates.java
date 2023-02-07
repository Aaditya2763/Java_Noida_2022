package Assignment_5_String;

public class stringRemoveDuplicates {
	public static void main(String[] args) {
		String str = "aabccba";
	removeDuplicate(str);
		
	}

public static void removeDuplicate(String str) {
	String ans="";
	
	for(int i=1;i<str.length();i++) {
		if (str.charAt(i) == str.charAt(i - 1)) {
			continue;
		} else {

			ans = ans + str.charAt(i - 1);
		}
		}
	ans = ans + str.charAt(str.length() - 1);
	System.out.println(ans);
	
	

}
}
