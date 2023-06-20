package ExamPreparation;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {

	public static void main(String args[]) {

		String s1 = "aaabbccccddeeeeeee";
		Map<Character, Integer> mapData = new HashMap<Character, Integer>();
		String characterData="";
		int tempCount=1;
		for (int i = 0; i < s1.length(); i++) {
			
			//mapData.put(s1.charAt(i), mapData.getOrDefault(s1.charAt(i), 0)+1);
			if (mapData.get(s1.charAt(i)) != null) {
				int count = mapData.get(s1.charAt(i)) + 1;
				mapData.put(s1.charAt(i), count);
				if(count>tempCount) {
					characterData=s1.charAt(i)+"";
					tempCount=count;
				}
			} else {

				mapData.put(s1.charAt(i), 1);
			}
		}
		System.out.println("mapData.." + mapData);
		System.out.println("character "+characterData+ " occur..."+tempCount+" times");
	}

}
