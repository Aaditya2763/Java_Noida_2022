package leetcode_pod;

public class mergeStringAlternatevely {
public static void main(String[] args) {
	String word1="abc";
	String word2="pqr";
	int i=0;
	StringBuilder res=new StringBuilder();
	if(word1.length()==word2.length()) {
		while(i<word1.length() && i<word2.length()) {
		
		res.append(word1.charAt(i));
		res.append(word2.charAt(i));
			i++;
			
			System.out.print(res);
		};
	
		
	}
	res.append(word1.substring(i,word1.length()));
	res.append(word1.substring(i,word2.length()));
	

}
}
