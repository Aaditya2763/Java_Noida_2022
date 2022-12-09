package Assignment_3;

import java.util.Scanner;

public class Von_nuoman_loves_Binary {
public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      
      for(int i=1;i<=n;i++){
          int j=scn.nextInt();
          int sum=0;
          int power=0;
          while(j>0) {
        	  int rem=j%10;
        	  sum=(int)(sum+rem*Math.pow(2,power));
        	  j=j/10;
        	  power++;
          }
          System.out.println(sum);
      }

}
}
