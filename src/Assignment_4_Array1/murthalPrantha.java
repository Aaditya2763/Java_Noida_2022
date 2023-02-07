package Assignment_4_Array1;

import java.util.Scanner;

public class murthalPrantha {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(minimumtime(arr,k));
	}
     public static int minimumtime(int[] arr, int Parantha) {
		int lo = 0;
		int hi = (arr[arr.length - 1] * (Parantha * (Parantha + 1))) / 2;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(arr, mid, Parantha)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}
		return ans;

	}

	public static boolean isitpossible(int[] arr, int mid, int parantha) {
		// TODO Auto-generated method stub
		int p = 1;// parantha banayega
		int time = 0;
		int tp = 0;// total parantha bana diya
		int i = 0;
		while (i < arr.length) {

			if (time + p * arr[i] <= mid) {
				time += p * arr[i];
				p++;
				tp++;
			} else {
				p = 1;
				i++;
				time = 0;
			}

			if (tp >= parantha) {
				return true;
			}

		}

		return false;
	}

}
