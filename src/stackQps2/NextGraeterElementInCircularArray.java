package stackQps2;

public class NextGraeterElementInCircularArray {
public static void main(String[] args) {
	int []arr= {1,2,3};
	NGE(arr);
}
public static void NGE(int []arr) {
	int j=1;
	
		
for(int i=0;i<arr.length;i++) {
	
	if(j==arr.length) {
		j=0;
	}
		if(arr[j]>arr[i]) {
			System.out.println(arr[j]);
			j++;
		}
		else {
			System.out.println(-1);
		}
	}
}
}

