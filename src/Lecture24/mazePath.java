package Lecture24;

public class mazePath {
public static void main(String[] args) {
	int m=3;
	int n=3;
	System.out.println(path(0, 0, m-1, n-1, ""));
	
}
public static int path(int curRow,int curCol,int endRow,int endCol,String ans) {
	 if(curRow==endRow && curCol==endCol) {
		 System.out.println(ans);
		 return 1;
	 }
	 if(curRow>endRow || curCol>endCol) {
		 return -1;
	 }
	int p1= path(curRow,curCol+1,endRow,endCol,ans+"H");
	int p2= path(curRow+1,curCol,endRow,endCol,ans+"V");
	return p1+p2;
}
}
