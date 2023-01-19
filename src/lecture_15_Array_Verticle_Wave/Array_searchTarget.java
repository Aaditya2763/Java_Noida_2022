package lecture_15_Array_Verticle_Wave;

public class Array_searchTarget {
public static void main(String[] args) {
	int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
System.out.println(Search(arr,21));
}
public static boolean Search(int [][]arr,int item) {
	int r=0;
	int c=arr[0].length-1;
	while(r<arr.length-1 && c>=0) {
		if(arr[r][c]==item) {
			return true;
		}
		else if(arr[r][c]>item) {
			c--;
		}
		else {
			r++;
		}
	}
	return false;
	
}
}
