package Lecture_1;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1000;
		int b=25;
		int c=9;
		int s =(a+b+c)/2;
	int Area= (int) (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
		System.out.println( " Area of triangle is "+ Area);
		
		
		

	}

}
