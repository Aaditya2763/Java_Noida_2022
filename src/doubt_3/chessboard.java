package doubt_3;

import java.util.Scanner;

public class chessboard {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
}
public static void chessBoard(int n,int cr,int cc,String ans) {
	if(cr==n-1 && cc==n-1) {
		System.out.println(ans+"{"+cr);
	}
	if(cr>=n || cc>=n) {
		return;
	}
	//knight move
	chessBoard(n,cr+2,cc+1,ans+"{"+cr+"_"+cc+"}K");
	chessBoard(n,cr+1,cc+2,ans+"{"+cr+"_"+cc+"}K");
	//rook move 
	//rook move in col
	if(cc==0 || cr==0|| cc==n-1 || cr==n-1) {
		for(int i=1;i<=n;i++) {
			chessBoard(n, cr, cc+i, ans+"{"+cr+"_"+cc+"}R");
		}
		//rook move in row;
		for(int i=1;i<=n;i++) {
			chessBoard(n, cr+i, cc, ans+"{"+cr+"_"+cc+"}R");
		}

	}
	
	//bishop move
//	if(cr==cc || cr+cc==n-1) {
//		for(int i=0;i)
//	}
	
	
}
}
