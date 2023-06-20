package Recursion;

public class ReverseString {
	
	public static void main(String[] args) {
		String str="welcome";
		System.out.println(reverseString(str));
		String s="r";
		s="a"+s;
		s="j"+s;
		System.out.println(s);
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String reverseString(String str)
    {
        //If entered string is empty
        //Return the empty string
        if (str.isEmpty())
            return str;
        //If string consists of multiple character    
        //Call the Function Recursively
        return reverseString(str.substring(1))+str.charAt(0);
    }
}
