package lecture_18;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Transverse {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
		Transverse(arr);
	}

	public static void Transverse(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[] ans = new int[m * n];
		int idx = 0;
		for (int d = 0; d < n + m - 1; d++) {
			int r = 0, c = 0;
			if (d < m) {
				c = d;
			} else {
				r = d - m + 1;
				c = m - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (c >= 0 && r < n) {
//				System.out.print(arr[r][c] + " ");
		list.add(arr[r][c]);
				r++;
				c--;
			}
			if (d % 2 == 0) {
				Collections.reverse(list);
			}
//		System.out.println(list);
//		System.out.println();
			for (int i = 0; i < list.size(); i++) {
				ans[idx] = list.get(i);
				idx++;
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]+" ");
		}
	}
}
