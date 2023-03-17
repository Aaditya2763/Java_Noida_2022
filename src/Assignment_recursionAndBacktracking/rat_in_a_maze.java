package Assignment_recursionAndBacktracking;

import java.util.Scanner;

public class rat_in_a_maze {
	static boolean ispath=false;
public static void main(String[] args) {


	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
	int [][]arr=new int [n][m];
	for(int i=0;i<arr.length;i++) {
		String str=scn.next();
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j]=str.charAt(j);
			//System.out.println((char)arr[i][j]);
		}
	}
	int [][]ans=new int[n][m];
	path(arr, 0, 0, ans);
	if(ispath==false) {
		System.out.println("-1");
	}
	
}
public static void path(int [][]maze,int row,int col,int [][]ans) {
	if(row==maze.length-1 && col==maze[0].length-1 && maze[row][col]!='X') {
		ans[row][col]=1;
		ispath=true;
		display(ans);
	
		return;
	}
if(row<0 ||col<0|| row>maze.length-1|| col>maze[0].length-1 || maze[row][col]=='X') {
	return;
}
	if(row>=0&&col==maze[0].length-1) {
		row+=1;
		}

	maze[row][col]='X';
	ans[row][col]=1;

	path(maze, row+1, col, ans);
	path(maze, row, col+1, ans);
	ans[row][col]=0;
	maze[row][col]='O';
	
}
public static void display(int[][]ans) {
for(int i=0;i<ans.length;i++) {
		
		for(int j=0;j<ans[0].length;j++) {
			
			System.out.print(ans[i][j]+" ");
		}
		System.out.println();
	}
System.out.println("++++++++++++");
}
}
