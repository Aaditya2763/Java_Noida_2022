package Assignment_5_String;

public class stringRemoveDuplicates {
	public static void main(String[] args) {
		String str = "aabccba";
	removeDuplicate(str);
		
	}

public static void removeDuplicate(String str) {
	String ans="";
	for(int i=0;i<str.length()-1;i++) {
		int j;
		for(j=0;j<=i;j++) {
			if(str.charAt(i)==str.charAt(j)) {
				break;
			}
			if(i==j) {
				ans=ans+str.charAt(i);
			}
			
			
		}
	
}

	System.out.println(ans);
}
}
