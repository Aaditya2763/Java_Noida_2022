package Assignment_recursionAndBacktracking;

public class wordSearch{
public static void main(String[] args) {
	char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
	String word = "ABCC";
	for(int i=0;i<maze.length;i++) {
		for(int j=0;j<maze[0].length;j++) {
			if(maze[i][j]==word.charAt(0)) {
				boolean ans= Search(maze,word,i,j,0);
				if(ans==true) {
					System.out.println(ans);
					return;
				}
			}
		}
	
	}
	System.out.println(false);
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
