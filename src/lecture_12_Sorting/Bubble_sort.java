package lecture_12_Sorting;

public class Bubble_sort {
public static void main(String[] args) {
	int [] arr= {5,4,3,2,1};
	sort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]); 
	}
}
public static void sort(int [] arr) {
	for (int i=1;i<arr.length;i++) {
		for (int j=0;j<arr.length-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
}
