package Assignment_6_recursion_1;

import java.util.Scanner;

public class boardPath {
	static int count=0;
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int size=scn.nextInt();
	int faces=scn.nextInt();
//	int size=3;
//	int faces=3;
	System.out.println("\n"+count(size, faces, 0, ""));
	System.out.println();
	
}
public static int count(int size,int faces, int cur,String ans) {

	if(cur==size) {
		System.out.print(ans+" ");
		return 1;
	}
	if(cur>size) {
		return 0;
	}
	int a=0;
	for(int i=1;i<=size;i++) {
		a=a+count(size, faces,cur+i, ans+i);
	}
	return a;
}
}

