package lecture_10;

public class Swap_Array1 {
public static void main(String[] args) {
	int a=9;
	int []arr= {1,2,3,4,5};
	System.out.println(arr[0]+" "+arr[1]);
	Swap(arr[0],arr[1]);
}
public static void Swap(int a,int b) {
	int temp=a;
	a=b;
	b=temp;
}
}
