package Assignment_6_recursion_1;

import java.util.Scanner;

public class mazePath_D {

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int m=scn.nextInt();
	int n=scn.nextInt();
	System.out.println("\n"+path(0, 0, m-1, n-1, ""));
	
}
public static int path(int curRow,int curCol,int endRow,int endCol,String ans) {
	 if(curRow==endRow && curCol==endCol) {
		 System.out.print(ans+" ");
		 return 1;
	 }
	 if(curRow>endRow || curCol>endCol) {
		 return 0;
	 }
	int p2= path(curRow+1,curCol,endRow,endCol,ans+"V");
	int p1= path(curRow,curCol+1,endRow,endCol,ans+"H");

	int p3= path(curRow+1,curCol+1,endRow,endCol,ans+"D");
	return p1+p2+p3;
}
}
