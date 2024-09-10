package Password_Strength_Tester_and_Cracker;

public class PasswordCracker {
    private static final String CHAR_SET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()";

    public static String crackPassword(String target) {
        return bruteForce("", target);
    }

    private static String bruteForce(String prefix, String target) {
        if (prefix.equals(target)) {
            return prefix;
        }
        if (prefix.length() >= target.length()) {
            return null;
        }
        for (char ch : CHAR_SET.toCharArray()) {
            String attempt = bruteForce(prefix + ch, target);
            if (attempt != null) {
                return attempt;
            }
        }
        return null;
    }
}
