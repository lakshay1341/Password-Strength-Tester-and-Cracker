package Password_Strength_Tester_and_Cracker;

import java.util.Scanner;

public class PasswordTool {
    private static final String CHAR_SET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Check Password Strength");
        System.out.println("2. Crack Password");
        System.out.println("3. Generate Random Password");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter a password to check its strength: ");
                String passwordToCheck = scanner.nextLine();
                System.out.println("Password Strength: " + PasswordStrengthChecker.checkStrength(passwordToCheck));
                break;
            case 2:
                System.out.print("Enter a password to crack: ");
                String passwordToCrack = scanner.nextLine();
                System.out.println("Cracked Password: " + PasswordCracker.crackPassword(passwordToCrack));
                break;
            case 3:
                System.out.print("Enter the length of the password to generate: ");
                int length = scanner.nextInt();
                String generatedPassword = PasswordGenerator.generatePassword(length);
                System.out.println("Generated Password: " + generatedPassword);
                System.out.println("Password Strength: " + PasswordStrengthChecker.checkStrength(generatedPassword));
                System.out.println("Cracked Password: " + PasswordCracker.crackPassword(generatedPassword));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
