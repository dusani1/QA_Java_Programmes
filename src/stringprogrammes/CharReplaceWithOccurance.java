package stringprogrammes;

public class CharReplaceWithOccurance {
	public static void main(String[] args) {
		String input = "opentext";
		char charToReplace = '4';
		// Expected output: open1ext2

		if (input.indexOf(charToReplace) == -1) {
			System.out.println("Replace characted is not avilable in String");
			System.exit(0);
		}
		int count = 1;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == charToReplace) {
				input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
				count++;
			}
		}

		System.out.println(input);
	}
}
