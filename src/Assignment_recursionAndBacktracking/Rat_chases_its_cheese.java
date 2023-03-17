package Assignment_recursionAndBacktracking;

import java.util.Scanner;

public class Rat_chases_its_cheese {

	static boolean isPath=false;
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
//		
	}
	int [][]ans=new int[n][m];
	Path(arr, 0, 0, ans);
	if(isPath==false) {
		System.out.println("PATH NOT FOUND");
	}
	
}

public static void Path(int[][]arr,int r,int c,int[][]ans) {
	//checking for n,m index of array;
	if(r==arr.length-1&&c==arr[0].length-1&&arr[r][c]!='X') {
		ans[r][c]=1;
		isPath=true;
		display(ans);
		return ;
	}
	if(r<0 ||c<0 || r>=arr.length ||c>=arr[0].length ||arr[r][c]=='X') {
		return;
	}
	
	arr[r][c]='X';
	ans[r][c]=1;
	int[]row= {0,0,1,-1};
	int[]col= {1,-1,0,0};
	for (int i = 0; i < col.length; i++) {
		Path(arr, r + row[i], c + col[i], ans);
	}
//	Path(arr,r-1,c,ans);//up
//	Path(arr,r+1,c,ans);//down
//	Path(arr,r,c+1,ans);//forward
//	Path(arr,r,c-1,ans);//backward
	arr[r][c]='O';
	ans[r][c]=0;
}
public static void display(int [][]ans) {
	for(int i=0;i<ans.length;i++) {
		
		for(int j=0;j<ans[0].length;j++) {
			
			System.out.print(ans[i][j]+" ");
		}
		System.out.println();
	}
//	System.out.println("*************");
}
}
