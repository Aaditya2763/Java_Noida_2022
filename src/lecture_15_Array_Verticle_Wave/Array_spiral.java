package lecture_15_Array_Verticle_Wave;

public class Array_spiral {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		printSpiral(arr);
	}

	public static void printSpiral(int arr[][]) {
		int minc = 0;
		int minr = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		int count = 0;
		int totalCount = arr.length * arr[0].length;

		while (count<totalCount) {
			
			for (int i = minc; i <= maxc &&count<totalCount; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;
			
			for (int i = minr; i <= maxr && count<totalCount; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;

			for (int i = maxc; i >= minc && count<totalCount; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}

			maxr--;
			for (int i = maxr; i >= minr && count<totalCount; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;

		}
	}
}
