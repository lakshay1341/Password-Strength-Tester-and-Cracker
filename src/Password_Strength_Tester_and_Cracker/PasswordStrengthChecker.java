package Password_Strength_Tester_and_Cracker;

public class PasswordStrengthChecker {
    public static String checkStrength(String password) {
        int length = password.length();
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) hasSpecial = true;
        }

        int classes = (hasUpper ? 1 : 0) + (hasLower ? 1 : 0) + (hasDigit ? 1 : 0) + (hasSpecial ? 1 : 0);

        // Length alone is never enough: a string with two or fewer distinct
        // characters stays Weak however long it is.
        if (password.chars().distinct().count() <= 2) {
            return "Weak";
        }

        if (length >= 12 && classes >= 3) {
            return "Strong";
        } else if ((length >= 8 && classes >= 2) || (length >= 20 && classes >= 1)) {
            // The length arm keeps long passphrases out of Weak without
            // counting a space as a special character.
            return "Medium";
        } else {
            return "Weak";
        }
    }
}
