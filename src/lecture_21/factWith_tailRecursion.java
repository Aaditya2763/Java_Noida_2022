package lecture_21;

public class factWith_tailRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fact(4,1));
		
	}
	//check call stack for reference 
	public static int fact(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return fact(n-1,ans*n);
	}

}
