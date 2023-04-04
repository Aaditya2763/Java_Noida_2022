package doubt_3;

public class leetcode_knightQues_2596 {
public static void main(String[] args) {
	
}
public static boolean knightTour(int [][]arr,int cr,int cc,int count) {
	int []r= {-2,-2,2,2,1,-1,1,-1};
	int []c= {-1,1,-1,1,2,2,-2,-2,-2};
	
	if(cc<0 || cr<0 || cr>=arr.length || cc>arr[0].length || arr[cr][cc]!=count){
		return false;
	}
	for(int i=0;i<c.length;i++) {
		boolean ans=knightTour(arr, cr+r[i], cc+c[i], count);
		if(ans) {
			return true;
		}
		
	}
	return false;
	
	}
}
