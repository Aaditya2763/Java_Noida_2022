package hackathon2;

public class emilyBirthday {
public static void main(String[] args) {
	int n=4;
	int []arr= {1,3,4,4,2,2};
	System.out.println(Birthday(arr));
}
public static int Birthday(int []arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				return arr[i];
			}
		}
		
	}
	return 0;	
	
}
}
