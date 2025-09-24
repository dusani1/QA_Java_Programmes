package stringprogrammes;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	/*
	 * Input: programming output: progamin
	 * 
	 * Approach: 1-Using java 8 2-Using indexOf(..) 3-Using CharacterArray 4-Using
	 * SetInterface methods
	 */

	public static void main(String[] args) {
		String str = "programming";

		// Approach-1:
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);

		// Approach-2:
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int inx = str.indexOf(ch, i + 1);
			if (inx == -1) {
				sb2.append(ch);
			}

		}
		System.out.println(sb2);

		// Approach-3:
		StringBuilder sb3 = new StringBuilder();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					repeated = true;
					break;
				}
			}

			if (!repeated) {
				sb3.append(ch[i]);
			}
		}
		System.out.println(sb3);

		//Approach-4:
		StringBuilder sb4 = new StringBuilder();
		Set<Character> lhs = new LinkedHashSet<>();
		for(int i=0; i<str.length(); i++) {
			lhs.add(str.charAt(i));
		}
		for(char c: lhs) {
			sb4.append(c);
		}
		System.out.println(sb4);
	}
}
