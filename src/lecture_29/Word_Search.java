package lecture_29;

public class Word_Search {
public static void main(String[] args) {
	char[][] maze = { { 'A', 'B', 'C', 'E' },
			{ 'S', 'F', 'C', 'S' },
			{ 'A', 'D', 'E', 'E' } };
	
	String word ="ABCCED";
	
	for(int i=0;i<maze.length;i++) {
		for(int j=0;j<maze[0].length;j++) {
			if(maze[i][j]==word.charAt(0)){
				boolean ans=Search(maze,word,i,j,0);
				if(ans==true) {
					System.out.println(ans);
					return;
				}
			}
		} 
	}
	System.out.println(false);
}

}
