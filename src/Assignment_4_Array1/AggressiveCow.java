package Assignment_4_Array1;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int nos=scn.nextInt();
		int noc=scn.nextInt();
		int []arr=new int [nos];
		for (int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
//		int[] stall = { 1, 2, 8, 4, 9 };
		Arrays.sort(arr);
//		int noc = 3;
		System.out.println(LargestminDistance(arr, noc));

	}

	public static int LargestminDistance(int[] stall, int noc) {
		int lo = stall[0];
		int hi = stall[stall.length - 1];

		int ans = 0;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;
			if (isitpossible(stall, noc, mid) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}

		return ans;

	}

	public static boolean isitpossible(int[] stall, int noc, int mid) {
		// TODO Auto-generated method stub
		int cow = 1;
		int pos = stall[0];
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				pos = stall[i];
				cow++;
			}
			if (cow == noc) {
				return true;
			}

		}
		return false;
	}
}
