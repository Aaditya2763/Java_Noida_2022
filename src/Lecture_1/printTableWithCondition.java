package Lecture_1;

import java.util.*;

public class printTableWithCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);;
				
		int num= 13;
		for(int i=1;i<=10;i++) {
			if((num*i)%4==0) {
				i++;
			}
			else {
				System.out.println(num+" * "+i+" = "+num*i);
			}
				
			
		
			
		}
		
		
	}

}
