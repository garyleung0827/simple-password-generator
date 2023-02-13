import java.util.Scanner;

public class Password {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean lowercase = false;
		boolean uppercase = false;
		boolean number = false;
		boolean symbol = false;
		String temp = "";
		int pwlength = 0;
		
		CharsetGenerator charset = new CharsetGenerator();
		PasswordGenerator pw = new PasswordGenerator();
		
		System.out.printf("Please input Lowercase(Yes/Y): ");
		temp = in.nextLine();
		if(temp.equalsIgnoreCase("yes") || temp.equalsIgnoreCase("y")) {
			lowercase = true;
		}

		System.out.printf("Please input the Uppercase(Yes/Y): ");
		temp = in.nextLine();
		if(temp.equalsIgnoreCase("yes") || temp.equalsIgnoreCase("y")) {
			uppercase = true;
		}

		System.out.printf("Please input the number(Yes/Y): ");
		temp = in.nextLine();
		if(temp.equalsIgnoreCase("yes") || temp.equalsIgnoreCase("y")) {
			number = true;
		}

		System.out.printf("Please input the symbol(Yes/Y): ");
		temp = in.nextLine();
		if(temp.equalsIgnoreCase("yes") || temp.equalsIgnoreCase("y")) {
			symbol = true;
		}
		
		charset.charset(lowercase,uppercase,number,symbol);
		
		System.out.printf("Please enter any character not to include: ");
		temp = in.nextLine();
		charset.removeChar(temp);
		
		
		System.out.printf("Please input the password length: ");
		pwlength = in.nextInt();
		in.nextLine();
		
		System.out.println(pw.passwordGenerate(pwlength,charset.charset));
		
		in.close();
	}

}
