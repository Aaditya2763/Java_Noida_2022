package Assignment_4_Array1;

import java.util.Scanner;

public class booleanMatrix {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
	int [][]arr=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=scn.nextInt();
		}
	}
	boolMatrix(arr, n, m);
	
}
public static void  boolMatrix(int[][]mat, int R,int C) {

	
	 int row[] = new int[R];
     int col[] = new int[C];
     int i, j;

    
     /* Store the rows and columns to be marked as
     1 in row[] and col[] arrays respectively */
     for (i = 0; i < R; i++) {
         for (j = 0; j < C; j++) {
             if (mat[i][j] == 1) {
                 row[i] = 1;
                 col[j] = 1;
             }
         }
     }

     /* Modify the input matrix mat[] using the
     above constructed row[] and col[] arrays */
     for (i = 0; i < R; i++)
         for (j = 0; j < C; j++)
             if (row[i] == 1 || col[j] == 1)
                 mat[i][j] = 1;
 


	for(i=0;i<R;i++) {
		for(j=0;j<C;j++) {
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
		}
	
	
}
}
