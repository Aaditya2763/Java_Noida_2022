package LEcture_13_Sorting;

public class K_th_Root {
public static void main(String[] args) {
	int n=87;
	int k=3;
	System.out.println(KthRoot(87,3));
}
public static int KthRoot(int n,int k){
	int low=1;
	int high=n;
	int ans=0;
	while(low<=high) {
		int mid=(low+high)/2;
		if(Math.pow(mid,k)<=n) {
			ans=mid;
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		
	}
	return ans;
}
}
