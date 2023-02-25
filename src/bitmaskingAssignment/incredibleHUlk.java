package bitmaskingAssignment;

public class incredibleHUlk {
public static void main(String[] args) {
	int n=5;
	System.out.println(steps(n));;
}
//public static int steps(int n) {
//	int y=2;
//	int i=n/2;
//int stepstaken=(int)Math.pow(y,i);
//int remStep=n-stepstaken;
//if(remStep==0) {
//	return 1;
//}
//
//return remStep+1;
//}

public static int  steps(int n) {
	int ans=0;

	while(n>0){
		// we can do like this 
//			ans+=(n&1);	
//			 n=n>>1;
		//or
	// 2nd method
		n=n&(n-1);
		ans++;
		}
       
        return ans;   

}
}
