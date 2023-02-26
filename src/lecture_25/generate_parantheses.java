
package lecture_25;

import java.util.ArrayList;
import java.util.List;

public class generate_parantheses {
public static void main(String[] args) {
	List<String> ll=new ArrayList<>();
	generate(3,"",0,0,ll);
	System.out.print(ll);
}
public static void generate(int n, String ans,int leftC,int rightC,List<String>ll) {

if(leftC==n && rightC ==n) {
	ll.add(ans);
//	System.out.println(ans+" ");
	return;
}
//if(leftC>=3) {
//	return;
//}
//if(rightC>=3) {
//	return;
//}
if(leftC<n) {
	generate(n,ans+"(",leftC+1,rightC,ll);
}
	
	if(leftC>rightC) {
		generate(n, ans+")",leftC,rightC+1,ll);
	}
	
}
}
