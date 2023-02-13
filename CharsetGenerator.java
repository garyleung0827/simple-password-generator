import java.util.ArrayList;

public class CharsetGenerator {

	public ArrayList<Character> charset = new ArrayList<Character>();

	public CharsetGenerator() {
	}

	/**
	 * 
	 * Create an array list of characters
	 * 
	 * @param lowercase
	 * @param uppercase
	 * @param number
	 * @param symbol
	 */
	public void charset(boolean lowercase, boolean uppercase, boolean number, boolean symbol) {
		// add lowercase according ascii table
		if (lowercase == true) {
			for (int i = 97; i < 123; i++) {
				charset.add((char) i);
			}
		}
		// add uppercase according ascii table
		if (uppercase == true) {
			for (int i = 65; i < 91; i++) {
				charset.add((char) i);
			}
		}
		// add number according ascii table
		if (number == true) {
			for (int i = 48; i < 58; i++) {
				charset.add((char) i);
			}
		}
		// add symbol according ascii table
		if (symbol == true) {
			for (int i = 33; i < 48; i++) {
				charset.add((char) i);
			}
			for (int i = 58; i < 65; i++) {
				charset.add((char) i);
			}
			for (int i = 91; i < 97; i++) {
				charset.add((char) i);
			}
			for (int i = 123; i < 127; i++) {
				charset.add((char) i);
			}
		}
	}

	public void removeChar(String s) {
		for (char ch : s.toCharArray()) {
			if (charset.contains(ch)) {
				charset.remove(Character.valueOf(ch));
			}
		}
	}

}
