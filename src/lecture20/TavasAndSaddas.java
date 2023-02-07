package lecture20;

import java.util.Scanner;

public class TavasAndSaddas {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	String str=scn.next();
	System.out.println(Index(str));
	
}
public static int Index(String str) {
	int n=str.length();
	int count=(1<<n)-2; // 
int pos=0;
for(int i=str.length()-1;i>=0;i--) {
	if(str.charAt(i)=='7') {
		count=count+(1<<pos);
	}
	pos++;
}
return count +1;
}

}
