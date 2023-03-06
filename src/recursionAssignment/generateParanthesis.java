	package recursionAssignment;

import java.util.Scanner;

public class generateParanthesis {

    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
generateparanthesis(n,0,0, "");
    }
    public static void  generateparanthesis(int n,int leftB,int rightB,String ans){
  if(leftB==n && rightB==n){
    System.out.println(ans);
    return;
}
if(leftB>rightB){
generateparanthesis(n,leftB,rightB+1,ans+")");
}
if(leftB<n){
generateparanthesis(n,leftB+1,rightB,ans+"(");
}


    }
}
