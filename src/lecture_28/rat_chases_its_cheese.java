package lecture_28;

import java.util.Scanner;

public class rat_chases_its_cheese {
	static boolean isfound=false;
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
	int [][]arr=new int[n][m];
	for(int i=0;i<arr.length;i++) {
	//getting a new string each time
		String str=scn.next();
	for(int j=0;j<arr[0].length;j++) {
//		initializing the character to jth index of each row 
		arr[i][j]=str.charAt(j);
		
	}
	}
int [][]ans=new int[n][m];
	path(arr,0,0,ans);	

	if(isfound==false) {
	System.out.println("NO PATH FOUND");
}
	
}

public static void path(int[][]arr,int row,int col,int[][]ans) {
	if(row==arr.length-1 && col==arr[0].length-1) {
		if(arr[row][col]!='X') {
			ans[row][col]=1;
			isfound=true;
			display(ans);
			
			return;
		}
	}
	if(row<0||col<0|| row>arr.length-1||col>arr[0].length-1 || arr[row][col]=='X') {
		return;
	}
	// we are getting the elements of r and c from our imagination check assignment
	//rat_chases_its_cheese Question for explanation in recursion and backtracking Assignment package
	arr[row][col]='X';
	ans[row][col]=1;
	int []r= {-1,1,0,0};
	int []c= {0,0,-1,1};
	for(int i=0;i<r.length;i++) {
//		path(arr, row+r[i], col, ans);
//		path(arr, row, col+c[i], ans);
		// instead of writing these twoline we can write it both in one line
   path(arr, row+r[i], col+c[i], ans);
	}
	ans[row][col]=0;
	arr[row][col]='O';
	
}

public static void display(int [][]arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}

}
