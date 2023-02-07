package Assignment_5_String;

import java.util.Scanner;

public class countPalindromicSubstring {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "abc";
//        Scanner scn=new Scanner(System.in);
//        String str=scn.next();
        PrintSubString(str);
		System.out.println(count);

	}

	public static int PrintSubString(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (isPalindrom(s1) == true) {
					// System.out.println(s1);
                    count =count+1;
				}
			}

		}
return count;
	}

	public static boolean isPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}


