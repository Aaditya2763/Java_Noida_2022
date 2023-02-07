package Assignment_6_recursion_1;

public class oddEvenUsingRecursion {
public static void main(String[] args) {
	  int n = 5;
	    printOdd(n);
	    System.out.println();
	    printEven(n);
	  }
	  
	  public static void printOdd(int n) {
	    if (n == 0)
	      return;
	    if (n % 2 != 0)
	      System.out.print(n + " ");
	    printOdd(n - 1);
	  }
	  
	  public static void printEven(int n) {
	    if (n == 0)
	      return;
	    printEven(n - 1);
	    if (n % 2 == 0)
	      System.out.print(n + " ");
	  }
}
