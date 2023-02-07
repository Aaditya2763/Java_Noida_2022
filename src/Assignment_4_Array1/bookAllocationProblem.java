package Assignment_4_Array1;

import java.util.Scanner;

public class bookAllocationProblem {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int pages = sc.nextInt();
			int students = sc.nextInt();
			int[] books = new int[pages];
			for(int i =0;i<books.length;i++) {
				books[i]= sc.nextInt();
			}
			System.out.println(booksSearch(books, students));
		}
	}
	public static int booksSearch(int[] books,int students){
			if(students>books.length) {
				return -1;
			}
			int high = 0;
			int result = -1;
			for(int i =0;i<books.length;i++) {
				high +=books[i];
			}
         int low = 0;
			while(low <=high) {
				int mid = low + (high-low)/2;
				if(isPossible(books,mid,students)){
					result = mid;
					high =mid-1;
				}else {
					low = mid+1;
				}
				
			}
			return result;
		}
		public static boolean isPossible(int[] books,int pages, int students) {
			int count =1;
			int sumAllocated =0;
			for(int i: books){
             if(sumAllocated + i <= pages){
                 sumAllocated += i;
             }else{
                 count++;
                 if(count > students || i > pages){
                     return false;
                 }
                 sumAllocated = i;
             }
         }
			return true;
 }

}
