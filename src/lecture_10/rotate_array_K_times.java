package lecture_10;

public class rotate_array_K_times {
public static void main(String[] args) {
	int[]arr= {1,2,3,4,5,6,7};
	int k=3;
	rotate(arr,k);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
}
public static void rotate(int[]arr,int k) {
	k=k%arr.length;
	int temp=arr[arr.length-1];
//	
//	for(int i=arr.length-2;i>=0;i--) {
//		arr[i+1]=arr[i];
//	}
	int i=1;
	while(i<5) {
	
		arr[i]=arr[i-1];
		System.out.println(arr[1]);
		i++;
		
	}
	arr[0]=temp;
}
}
