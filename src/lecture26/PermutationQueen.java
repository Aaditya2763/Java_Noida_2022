package lecture26;

public class PermutationQueen {
public static void main(String[] args) {
	int n=4;
	boolean[]board=new boolean[n];
	int totalQueen=2;
	QueenPer(board,totalQueen,"",0,0);
}

public static void QueenPer(boolean[] board,int totalQueen,String ans,int qpsf,int idx) {
	if(qpsf==totalQueen) {
		System.out.println(ans);
		return;
	}
	for(int i=idx;i<board.length;i++) {
		if(board[i]==false) {
			board[i]=true;
			QueenPer(board, totalQueen, ans+"b"+i+"q"+qpsf, qpsf+1,i+1);
		// we have to change true to false here  to  display all the outputs
	//we use backtracking when recursion is unable to undo the changes
	board[i]=false;
		}
	}
} 
}
