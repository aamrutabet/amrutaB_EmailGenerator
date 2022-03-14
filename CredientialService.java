package credential;

import java.util.Random;

import employee.Employee;

public class CredientialService { 

	String AT = "@";
	String DOT = ".";
	public String genratePassword(Employee e) {
		String capLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String spacialChar = "!@#$%&*";
		String combinedChars = capLetters+lowerLetters+numbers;
		char[] password = new char[8];
		Random r = new Random();
		password[0] = lowerLetters.charAt(r.nextInt(lowerLetters.length()));
		password[1] = numbers.charAt(r.nextInt(numbers.length()));
		password[2] = spacialChar.charAt(r.nextInt(spacialChar.length()));
		password[3] = capLetters.charAt(r.nextInt(capLetters.length()));
		for (int i = 4; i < 8; i++) {
			password[i] = combinedChars.charAt(r.nextInt(combinedChars.length()));
		}
		return new String(password);
	}
	
	public String generateEmailAddress(Employee e) {
		StringBuilder email =new StringBuilder(); 
		email.append(e.getfName().toLowerCase()).append(e.getlName().toLowerCase()).append(AT).append(e.getDept().label)
				.append(DOT).append("gl").append(DOT).append("com");
		return email.toString();
	}
	
	public void showCredentials(Employee e) {
		System.out.println();
		System.out.printf("Dear %s your generated credentials are as follows", e.getfName());
		System.out.println();
		System.out.println("Email --> " + generateEmailAddress(e));
		System.out.println("Password -->" + genratePassword(e));
	}
}
