package stringprogrammes;

public class ReverseString {

	public static void main(String[] args) {
		String str = "hello";

		// Approach1:
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println();
		// Approach2:
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();
		// Approach3:
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());

		// Approach4:
		StringBuffer sbuf = new StringBuffer(str);
		System.out.println(sbuf.reverse());
		//git practice

	}

}
