package Assignment_5_String;

public class stringMAxFrequency {
	public static void main(String[] args) {
		String str = "abbdddc";
		maxString(str);
	}

	public static void maxString(String str) {

		char ans;
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			int totalcount = 0;
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count = count++;
						 	totalcount = count;
					ans =  str.charAt(i);
					System.out.println(totalcount);
				}
				
			}
			
		}
		
	}

}
