package lecture_26;

import java.util.Iterator;

public class lexoCounting {
public static void main(String[] args) {
	int n=1000;
	printLexo(0,n); 
}
public static void printLexo(int curr,int range){
	if(curr>range) {
		return;
	}
	System.out.println(curr);
	int i=0;
	if(curr==0) {
		i=1;
	}
	for(;i<=9;i++) {
		printLexo(curr*10+i, range);
	}
	
}
}
