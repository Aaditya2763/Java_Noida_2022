package lecture_10;

public class Swap_array3 {
public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5};
		int []other= {20,30,40,50,60};
		System.out.println(arr[0]+" "+other[0]);
		Swap(arr,other);
		System.out.println(arr[0]+" "+other[0]);
	}
//Java is call by value not call by reference 
	public static void Swap(int[]arr,int []other) {
		int [] temp=arr; //here variables are always created in stack memory;
		arr=other;  // changesb are always reflect here like(temp=2k,arr=4k,other=2k)
		           //but when function terminates it  will destroy  all your variables
		           //changes reflect only when we change any value by selecting particular value
		other=temp;  // this will only swap the addresses but don't change the value; 
	}
}
