package lecture_30;

public class mergeSort {
public static void main(String[] args) {
	int[]arr= {7,5,1,4,2};
	int[]ans=Sort(arr,0,arr.length-1);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
	
}
public static int []Sort(int []arr,int si,int ei){
	if(si==ei) {
		int[]bs=new int[1];
		bs[0]=arr[si];
		return bs;
	}
	int mid=(si+ei)/2;
	int []fs =Sort(arr,si,mid);
	int []ss=Sort(arr,mid+1, ei);
	return (mergetwosortedarray(fs, ss));
}

public static int [] mergetwosortedarray(int []arr1,int []arr2){
	int n=arr1.length;
	int m=arr2.length;
	int[]ans=new int[n+m];
	int i=0,j=0,k=0;
	while(i<n&&j<m) {
		if(arr1[i]<arr2[j]) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		else {
			ans[k]=arr2[j];
			j++;
			k++;
		}
	}
	while(i<n) {
		ans[k]=arr1[i];
		i++;
		k++;
	}
	while(j<m) {
		ans[k]=arr2[j];
		j++;
		k++;
	}
    return ans;
}
}
