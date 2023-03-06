package lecture26;

public class combination_queen {
public static void main(String[] args) {
	int n=4;
	boolean[]board=new boolean[n];
	int totalQueen=2;
	QueenPer(board,totalQueen,"",0);
}
//qpsf queen place so far 
//this will give only three output because we are not returning back to the  board===0
//public static void QueenPer(boolean[] board,int totalQueen,String ans,int qpsf) {
//	if(qpsf==totalQueen) {
//		System.out.println(ans);
//		return;
//	}
//	for(int i=0;i<board.length;i++) {
//		if(board[i]==false) {
//			board[i]=true;
//			QueenPer(board, totalQueen, ans+"b"+i+"q"+qpsf, qpsf+1);
//		// we have to change true to false here  to  display all the outputs
//	//
//	
//		}
//	}
//}
public static void QueenPer(boolean[] board,int totalQueen,String ans,int qpsf) {
	if(qpsf==totalQueen) {
		System.out.println(ans);
		return;
	}
	for(int i=0;i<board.length;i++) {
		if(board[i]==false) {
			board[i]=true;
			//we are increasing qpsf by qpsf+1  because we have limited number of queens
			QueenPer(board, totalQueen, ans+"b"+i+"q"+qpsf, qpsf+1);
		// we have to change true to false here  to  display all the outputs
	//
	board[i]=false;
		}
	}
}
}
