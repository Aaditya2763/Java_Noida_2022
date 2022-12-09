package lecture_10;

//two pointer approach
public class reverse_Array {
public static void main(String[] args) {
	int []arr= {2,3,1,4,15,6,7};
	Reverse(arr);
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println(arr[i]);
	}

}
public static void Reverse(int[]arr) {
	int i=0;
	int j=arr.length-1;
	while(i<=j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
}