package doubt;

import java.util.Scanner;

public class doubt1 {
public static void main(String[] args) {
	
	
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int space=n-1;
		int row=1;
		int count=1;
		while(row<=2*n-1) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			
			int k=1;
		
			while(k<=star) {
				System.out.print(count+" ");
				if(k<=row){
					count++;
				}
				else{
					count--;
				}
				k++;
			}
			
			if(row<n) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			
			
			System.out.println();
			row++;
			
	
			
			
			
			
		}

}
	
}
