package stringprogrammes;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Hello";
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int count = map.get(c);
				map.put(c, count + 1);
			}

		}
			System.out.println(map);
	}

}
