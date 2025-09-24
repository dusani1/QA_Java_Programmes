package stringprogrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "AABCDEB";
		//Approach-1:
		for(int i=0; i<str.length(); i++) {
			boolean unique = true;
			for(int j=0; j<str.length(); j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					unique=false;
					break;
				}
			}
			
			if(unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		
		//Approach-2:
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		//System.out.println(hm);	
		
		for(Entry<Character, Integer> entryset: hm.entrySet()) {
			if(entryset.getValue()==1) {
				System.out.println(entryset.getKey());
				break;
			}
		}
	}
}
