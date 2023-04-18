package Lecture_1;

import java.util.Scanner;

public class Test {
    public static void main (String args[]) {
Scanner scn=new Scanner (System.in);
int m=scn.nextInt();
int n=scn.nextInt();
int k=scn.nextInt();
char[][]board=new char [m][n];
for(int i=0;i<m;i++){
    String str=scn.next();
    for(int j=0;j<n;j++){
board[i][j]=str.charAt(j);
    }
}


	String word=scn.next();
	for(int i=0;i<board.length;i++){
	    for(int j=0;j<board[0].length;j++){
	        if(board[i][i]==word.charAt(0)){
	        boolean ans=Search(board,word,i,j,0);
	        if(ans){
	            System.out.print(ans+word+" ");
	            return;
	        }
	        }
	    }
	}

 

// System.out.println(Search(board,word,0,0,0));
	

    }
    public static boolean Search(char[][] maze,String word,int row,int col,int idx) {
    	if(idx==word.length()) {
    		return true;
    	}
    	if(row<0||col<0||row>=maze.length-1||col>=maze[0].length-1||maze[row][col]!=word.charAt(idx)) {
    		return false;
    	}
    	maze[row][col]='*';
    	int []r= {-1,1,0,0};
    	int []c= {0,0,-1,1};
    	for(int i=0;i<r.length;i++) {
    		boolean ans=Search(maze, word, row+r[i], col+c[i], idx+1);
    		if(ans==true) {
    			return ans;
    		}
    	}
    	maze[row][col]=word.charAt(idx);
    	
    	return false;
    }
}
