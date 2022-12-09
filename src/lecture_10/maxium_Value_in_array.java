package lecture_10;

public class maxium_Value_in_array {
	public static int maximum(int[] arr ) {

		int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
				max=arr[i];
				
				}
				
			}
			return max;
		}
public static void main(String[] args) {
	int []arr= {2,3,1,4,15,6};
	System.out.println(maximum(arr));
}

}
