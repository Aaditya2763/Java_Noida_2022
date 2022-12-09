package Lecture_1;

public class printGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=30;
	if(marks>=80) {
		System.out.println("Your grade is A");
	}
	else if( marks<80 && marks>=70) {
		System.out.println("Your grade is B");
	}
	else if( marks<70 && marks>=60) {
		System.out.println("Your grade is C");
	}
	else if( marks<60 && marks>=50) {
		System.out.println("Your grade is D");
	}
	else if(marks<50 && marks>=35) {
		System.out.println("you are pass");
	}
	else {
		System.out.println("You are Fail");
	}
	}

}
