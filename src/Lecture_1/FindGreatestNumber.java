package Lecture_1;

public class FindGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20; int c=15;
//Ist Type
// if(a>b && a>c) {
//	 System.out.println("greatest number is "+a);
// }
// if(b>a && b>c) {
//	 System.out.println("greatest number is " +b);
// }
// else {
//	 System.out.println("greatest number is " +c);
// }

//2nd condition
if(a>b && a>c) {
	System.out.println("greatest number is "+a);
}
else if(b>c) {
	System.out.println("greatest number is "+b);
}
else {
	System.out.println("greatest number is "+c);
}
	}

}
