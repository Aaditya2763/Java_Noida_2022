package Assignment_4_Array1;

import java.util.Scanner;

public class helpRamuSelf {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int t=scn.nextInt();
	while(t-->0) {
		int c1=scn.nextInt();
		int c2=scn.nextInt();
		int c3=scn.nextInt();
		int c4=scn.nextInt();
		int n =scn.nextInt();
		int m =scn.nextInt();
		int []rikshawRide=new int[n];
		int []cabRide=new int[m];
		for (int i=0;i<rikshawRide.length;i++) {
			rikshawRide[i]=scn.nextInt();
		}
		for (int i=0;i<cabRide.length;i++) {
			cabRide[i]=scn.nextInt();
		}
		minfare(rikshawRide,cabRide,c1,c2,c3,c4);
	}
	
}
public static void minfare(int []rikshawRide,int []cabRide,int c1,int c2,int c3,int c4) {
	int ans =0;
	int minRikshawFare=0;
	int minCabFare=0;
//calculating minimum fare for rikshaw
	for(int i=0;i<rikshawRide.length;i++) {
	 minRikshawFare=minRikshawFare+Math.min(c1*rikshawRide[i], c2);
	
	}
//	System.out.println(minRikshawFare);
	//calculating minimum fare for cab
	for (int i=0;i<cabRide.length;i++) {
		minCabFare=minCabFare+Math.min(c1*cabRide[i],c2);
		
	}
//	System.out.println(minCabFare);
	//mimimum rikshaw fare as compared with c3
	minRikshawFare=Math.min(minRikshawFare, c3);
//System.out.println(minRikshawFare);
	//mimimum cab fare as compared with c3
minCabFare=Math.min(minCabFare,c3);
//System.out.println(minCabFare);
ans=Math.min(minRikshawFare+minCabFare,c4);
System.out.println(ans);
}
}
