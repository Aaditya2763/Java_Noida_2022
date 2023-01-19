package lecture_11_Array_leetcode_Ques;

public class rainWaterHarwesting {
public static void main(String[] args) {
	int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
	System.out.println(RainWater(arr));
}
public static int RainWater(int[]arr) {
	int []left=new int [arr.length];
	left[0]=arr[0];
	for (int i=1;i<left.length;i++) {
		left[i]=Math.max(left[i-1],arr[i]) ;
	}
	
	int []Right=new int [arr.length];
	int n=arr.length;
	Right[n-1]=arr[n-1];
	for (int i=n-2;i>=0;i--){
		Right[i]=Math.max(Right[i+1],arr[i]) ;
	}
	int sum=0;
	for (int i=0;i<Right.length;i++) {
		sum=sum+Math.min(left[i],Right[i])-arr[i];
	}
	return sum;
}

}
