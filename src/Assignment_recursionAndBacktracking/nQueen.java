package Assignment_recursionAndBacktracking;

import java.util.Scanner;

public class nQueen {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean[][]board=new boolean [n][n];
		System.out.println("\n"+print(board, 0, n));;
	}
	public static int print(boolean[][]board,int row,int tq) {
		if(tq==0) {
			display(board);
			return 1;
		}
		int p=0;
		for(int col=0;col<board[0].length;col++) {
			//here we will check for isSafe(board,0,0) upto(board,0,4)
			//and then we will call the recursive call
			
			if(isSafe(board,row,col)) {
				
				board[row][col]=true;
			p=p+print(board, row+1, tq-1);
				board[row][col]=false;
			}
		}
		return  p;
	}
	public static boolean isSafe(boolean[][]board,int row,int col){
		//up direction
		int r=row;
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
			}
			r--;
		}
		
		//diagonal left
		r=row;
		int c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		//diagonal right
		r=row;
		c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c]==true) {
				
			return false;
			}
			r--;
			c++;
		}
		
		return true;
	}
public static void display(boolean [][]ans) {
	for(int i=0;i<ans.length;i++) {
		
		for(int j=0;j<ans[0].length;j++) {
			
			if(ans[i][j]==true) {
				System.out.print("{"+(i+1)+"-"+(j+1)+"}");
			}
		}
		
	}
}
}
