package ExamPreparation;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String args[]) {

		String s1 = "good";
		String s2 = "doog";
		if (s1.length() != s2.length()) {
			System.out.println(false);
		}
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
