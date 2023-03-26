package doubt;

import java.util.Scanner;

public class TEST {
	
	public static void main(String[] args) {
//		System.out.println(kItemsWithMaximumSum(3, 2, 0, 2));
		System.out.println(prime(8));
}
	public  static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes>0 && numZeros>=0 &&  numNegOnes==0){
            return k;
        }
        
        else if (numNegOnes >numOnes) {
        		return 0;
        	
        }
        else {
        	return numOnes-numNegOnes;
        }
        
    }

	
	public static int prime(int a) {
		 for (int i = 2; i*i < a; i++)
		        if (a % i != 0)
		            return i;
		 
		    return 0;
	}
     
}
