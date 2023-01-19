package lecture_16;

public class stringReverse {
	public static void main(String[] args) {
		 String str="              boy                   a   is    Mozim    ";


	       // System.out.println(str.trim());
	        System.out.println(Reverse(str));
	    }

	    public static String Reverse(String str){
	        str= str.trim();
// this is regex(regular expression)
	        String[] arr=str.split("\s+');
	        String ans="";
	        for (int i = arr.length-1; i>=0 ; i--) {

	            ans=ans+arr[i]+" ";

	        }                                    

	        return ans.trim();

	    }
}
