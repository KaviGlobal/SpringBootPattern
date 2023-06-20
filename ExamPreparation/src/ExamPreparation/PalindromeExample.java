package ExamPreparation;


public class PalindromeExample {

	public static void main(String args[]) {

		String s1 = "good";
		System.out.println(reverseString(s1));
		//System.out.println(reverseString(s1,reverseStringData));
		/*for(int length=s1.length()-1;length>=0;length--) {
			s2+=s1.charAt(length);
		}
		System.out.println(s2);*/
	}

	public static String reverseString(String s1,String reverseStringData){
		
		if(s1.length()<=1 || s1==null) {
			return reverseStringData+=s1.charAt(s1.length()-1);
		}
		else {
			reverseStringData+=s1.charAt(s1.length()-1);
			return reverseString(s1.substring(0, s1.length()-1),reverseStringData);
		}
    }
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String reverseString(String str)
    {
		if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

	
}
