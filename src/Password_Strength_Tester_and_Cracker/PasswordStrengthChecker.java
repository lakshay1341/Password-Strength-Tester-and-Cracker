package Password_Strength_Tester_and_Cracker;

public class PasswordStrengthChecker {
    public static String checkStrength(String password) {
        int length = password.length();
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        String specialChars = "!@#$%^&*()";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (specialChars.contains(String.valueOf(ch))) hasSpecial = true;
        }

        if (length >= 12 && hasUpper && hasLower && hasDigit && hasSpecial) {
            return "Strong";
        } else if (length >= 8 && ((hasUpper && hasLower) || (hasLower && hasDigit) || (hasUpper && hasDigit))) {
            return "Medium";
        } else {
            return "Weak";
        }
    }
}
