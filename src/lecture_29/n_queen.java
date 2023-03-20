package lecture_29;

public class n_queen {
public static void main(String[] args) {
	   int n=4;
	   boolean[][]board =new boolean[n][n];
//	   display(board);	
	   Print(board, n,0);
	   
}
public static void  Print (boolean[][]board,int tq,int row) {
	if(tq==0) {
	display(board);
		return;
	}
	for(int col=0;col<board[0].length;col++) {
		if (isSafe(board,row,col)) {	
			board[row][col]=true;
			Print(board,tq-1,row+1);
			board[row][col]=false;
		}
	}
	
}
public static boolean isSafe(boolean[][]board,int row,int col) {
	int r=row;
	int c=col;
	//for up direction
	while(r>=0) {
		if(board[r][c]==true) {
			return false;
		}
		r--;
	}
	
// we will assign row and col to r and c  because row and col because
	//row and col become 0  we we check for queen up and diagonally
//right diagonal
	r=row;
	while(r>=0 && c<board.length) {
		if(board[r][c]==true) {
			return false;
		}
		c++;
		r--;
	}
	//left diagonal
	r=row;
	 c=col;
	while(r>=0 &&c>=0) {
		if(board[r][c]==true) {
			return false;
		}
		c--;
		r--;
	}
	
	return true;
}
public static void display(boolean[][]board) {
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[0].length;j++) {
			System.out.print(board[i][j]+" ");
		} 
		System.out.println();
	}
}

}
