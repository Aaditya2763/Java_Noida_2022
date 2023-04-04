package doubt_3;

import java.util.Scanner;

public class k_th_knight {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n =scn.nextInt();
	boolean [][]board=new boolean[n][n];
	Knight(board, 0, 0,"", n);
}
public static void Knight(boolean[][]board,int cr ,int cc,String ans,int tk) {
	if(tk==0) {
		System.out.print(ans+"{"+cr+"-"+cc+"}");
		return;
	}
	if(cc== board.length){
		cr++;
		cc=0;
	}
	if(cr>=board.length) {
		return;
	}
	
	if(isSafe(board,cr,cc)) {
		board[cr][cc]=true;
		Knight(board,cr,cc+1,ans+"{"+cr+"-"+cc+"}",tk-1);
		board[cr][cc]=false;         
	}
	Knight(board,cr,cc+1,ans,tk);
}
public static boolean isSafe(boolean [][]board,int cr,int cc) {
	int []r= {-2,-2,-1,-1};
	int []c= {-1,1,-2,2};
	for(int i=0;i<c.length;i++) {
		int x=cr+r[i];
		int y=cc+c[i];
		if(x>=0 && y>=0 && x<board.length && y<board.length && board[x][y]==true) {
			return false;
		}
	}
	return true;
}

}
