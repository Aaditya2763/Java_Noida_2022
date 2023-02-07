package lecture_21;

public class Array_1st_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {2,3,4,2,5,7,2};
System.out.println(Index(arr,5 ,0));
	}
	public static int Index(int []arr,int item,int i) {
		if(i==arr.length) {
			return -1;
		}
		if (arr[i]==item) {
			return i;
		}
		return Index(arr,item,i+1);
	}

}


