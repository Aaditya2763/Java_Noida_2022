package patternAssignment;

import java.util.Scanner;

public class pattern_double_side_Arrow {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int r=scn.nextInt();
	   int row=1;
    // int space1=r+1-2*row;
     int space1=r-1;
     int star=1;
     int space2=-1;
    while(row<=r){
        //space

        for (int i = 1; i <=space1 ; i++) {
            System.out.print("  ");
        }
        //for star1
        int val;     // starting value of numbers

        if (row <= r/2 + 1) {
            val = row;               // till mid value is equal to row number
        } else {
            val = r-row + 1;     // after mid values are total rows - current row +1
        }
        for (int i = 1; i <=star ; i++) {
            System.out.print(val+"  ");
              val--;
        }
        //space2
        for (int i = 2; i <=space2 ; i++) {
            System.out.print("  ");
        }
        //star2
        int j=1;
          val++;
         if (row==1||row==r){
        	 j=2;
         }

        for (; j <=star ; j++) {
            System.out.print(val+"  ");
            val++;
        }
        if (row <= r / 2) {
            space1 -= 2;
            star++;
            space2 += 2;
        } else {
            space1 += 2;
            star--;
            space2 -= 2;
        }
row++;
        System.out.println();
    }
}
}
