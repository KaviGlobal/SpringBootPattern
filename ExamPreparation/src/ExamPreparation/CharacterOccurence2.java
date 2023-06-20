package ExamPreparation;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence2 {

	static final int MAX_CHAR = 256;

	public static void main(String args[]) {

		
		String str = "aaabbccccddeeeeeee";
		int count[] = new int[MAX_CHAR];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;

		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 1) {
				System.out.println("count..." + count[i]);
			}
		}
		// System.out.println("mapData.." + mapData);
		// System.out.println("character "+characterData+ " occur..."+tempCount+"
		// times");
	}

}
