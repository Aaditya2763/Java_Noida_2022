package Assignment_4_Array1;

import java.util.Scanner;

public class paintersPartition {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int k = sc.nextInt();
	int n = sc.nextInt();
	int[] board = new int[n];
	for(int i =0;i<n;i++) {
		board[i]= sc.nextInt();
	}
	System.out.println(Partition(board,k));
}
public static int Partition(int[]board, int k ) {
	int lo = 0;
	int hi =0;
	for (int i = 0; i < board.length; i++) {
		hi=hi+board[i];
	}
	int ans =0;
	while(lo<=hi) {
		int mid = (lo+hi)/2;
		if(ispossible(board,k,mid)) {
			ans = mid;
			hi = mid-1;
		}
		else {
			lo = mid+1;
		}
	}
	return ans ;
}
public static boolean ispossible(int[] board,int k , int mid) {
	int p =1;
	int time =0;
	int i =0;
	while(i<board.length) {
		if(time+board[i]<=mid) {
			time+=board[i];
			i++;
		}else {
			p++;
			time=0;
		}
		if(p>k) {
			return false;
		}
	}
	
	return true;
}
}

