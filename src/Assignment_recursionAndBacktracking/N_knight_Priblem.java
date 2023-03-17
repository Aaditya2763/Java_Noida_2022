package Assignment_recursionAndBacktracking;

import java.util.Scanner;

public class N_knight_Priblem {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	boolean[][]board=new boolean[n][n];
	Print(board, 0, n);
	
}
public static void Print(boolean[][]board,int row,int tk) {
	if(tk==0) {
		display(board);
		return;
	}
	for(int col=0;col<board[0].length;col++) {
		if(isSafe(board,row,col)) {
			board[row][col]=true;
			Print(board, row+1, tk-1);
			board[row][col]=false;
		}
	}
}
public static boolean isSafe(boolean[][]board,int row,int col) {
	//upLeft
	int r=row;int c=col;
	while(r>=0 && c>=0) {
		if(board[r][c]==true) {
			return false;
		}
		r=r-2;
		c--;
	}
	//upRight
	r=row; c=col;
	while(r>=0&& c<board[0].length) {
		if(board[r][c]==true) {
			return false;
		}
		r=r-2;
		c++;
	}
	
	return true;
}
public static void display(boolean[][]ans) {
	for(int i=0;i<ans.length;i++) {
		
		for(int j=0;j<ans[0].length;j++) {
			
			System.out.print(i+" "+j);
		}
		System.out.println();
	}
}
}
