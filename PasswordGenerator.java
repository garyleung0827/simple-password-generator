import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PasswordGenerator {
	
	public PasswordGenerator() {
	}

	public String passwordGenerate(int pwlength, ArrayList<Character> charset) {
		StringBuilder pw = new StringBuilder();
		final int size = charset.size(); //size of the charset
        for (int i = 0; i < pwlength; i++) {
        	int randomNum = ThreadLocalRandom.current().nextInt(0, size + 1);
        	pw.append(charset.get(randomNum));
        }
        return pw.toString();
	
	}
}
