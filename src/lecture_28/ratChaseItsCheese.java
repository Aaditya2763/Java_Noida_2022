package lecture_28;

import java.util.Scanner;

public class ratChaseItsCheese {
	static boolean f=false;
	    public static void main(String args[]) {
	Scanner scn=new Scanner (System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
	int [][]arr=new int[n][m];
	for(int i=0;i<arr.length;i++){
		String s=scn.next();
		for(int j=0;j<arr[0].length;j++){
			arr[i][j]=s.charAt(j);
		}
	}
	int [][]ans =new int [n][m];
Printmaze(arr, 0,0,ans);

if(f==false) {
	System.out.println("PATH NOT FOUND");
}
		}
	public static void Printmaze(int [][] maze,int cr,int cc,int[][] ans){
 if(cr==maze.length-1 && cc==maze[0].length-1) {
	 ans[cr][cc]=1;
	 f=true;
	 display(ans);
	 
	 return;
 }
		if(cc<0 || cr<0||cr>=maze.length||cc>=maze[0].length ||maze[cr][cc]=='X'){
			return ;		
		}

		maze[cr][cc]='X';	
		ans[cr][cc]=1;
	Printmaze(maze,cr+1,cc,ans);//down

	Printmaze(maze,cr,cc+1,ans);//right

	Printmaze(maze,cr-1,cc,ans);//up

	Printmaze(maze,cr,cc-1,ans);//left
	
	maze[cr][cc]='O';
	ans[cr][cc]=0;
	}
	public static void display(int [][]ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
	    }

