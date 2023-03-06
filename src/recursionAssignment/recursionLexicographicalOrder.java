package recursionAssignment;

import java.util.Scanner;

public class recursionLexicographicalOrder {

    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
lexoCounting(0,n);
        // Your Code Here
    }
    public static void lexoCounting(int curr,int range){

if(curr>range){
    return;
}
 System.out.print(curr+" ");
int i=0;
if(curr==0){
i=1;
}
for( ;i<=9;i++){
    lexoCounting(curr*10+i,range);
}
       

    }
}
