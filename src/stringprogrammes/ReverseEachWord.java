package stringprogrammes;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("original string:: "+ str);
		String[] words = str.split(" ");
		String revString = "";
		for(String word: words) {
			String revWord = "";
			for(int i=word.length()-1; i>=0; i--) {
				revWord += word.charAt(i);
			}
			revString += revWord +" ";
		}
		System.out.println("reversed string:: "+ revString);
		
	}

}
