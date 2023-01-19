package LEcture_13_Sorting;

public class leetcode_First_Bad_Version {
public static void main(String[] args) { 
	int stall[]= {1,2,8,4,9};
	int noc=3;
	
}
public static int LargestnidDistance(int []stall,int noc) {
	//we have to short arr because to arrange the distance
	int lo=0;
	int hi=stall[stall.length-1];
	int ans =0;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(isitPosiible(stall,noc,mid)==true){
			ans=mid;
			lo=mid+1;
		}
		else {
			hi=mid-1;
		}
		
	}
	return ans;
}
public static boolean isitPosiible(int []stall,int mid,int noc) {
	
	return false;
}
}
