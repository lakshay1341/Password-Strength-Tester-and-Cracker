package Password_Strength_Tester_and_Cracker;

/**
 * Minimal self-check that every case from issue #2 gets the rating we agreed
 * on. The expected values below are the spec: if a threshold is ever tweaked,
 * the row that flips says what it broke. No test framework needed:
 *
 * <pre>
 *   javac -d bin src/Password_Strength_Tester_and_Cracker/*.java
 *   java -cp bin Password_Strength_Tester_and_Cracker.PasswordStrengthCheckerTest
 * </pre>
 */
public class PasswordStrengthCheckerTest {
    private static int failures = 0;

    public static void main(String[] args) {
        // Rows from the issue table.
        expect("correct-horse-battery1A", "Strong"); // hyphen counts as special now
        expect("Tr0ub4dor&3_", "Strong");
        expect("my_secure_pass_2026!", "Strong");
        expect("my_secure_pass_2026", "Strong");     // underscore is special -> 3 classes; the trailing ! was never what decided it
        expect("P@ssw0rd[]{}", "Strong");            // [ ] { } count as special now

        // The two judgement calls.
        expect("correct horse battery staple", "Medium"); // 29-char passphrase: rescued by length, not by calling a space special
        expect("aaaaaaaaaaaaaaaaaaaa", "Weak");           // 20 characters, 1 distinct -> length alone is not enough
        expect("abcdefgh 1234", "Medium");                // 13 chars, lower+digit: the space adds no class, so this stays below Strong's 3

        // Threshold guards.
        expect("abcdefgh", "Weak");   // 8 chars, 1 class
        expect("abcdefg1", "Medium"); // 8 chars, 2 classes
        expect("Ab3$xY7!", "Medium"); // all four classes but under 12 -> not Strong

        if (failures == 0) {
            System.out.println("All strength checks passed.");
        } else {
            System.out.println(failures + " check(s) FAILED.");
            System.exit(1);
        }
    }

    private static void expect(String password, String expected) {
        String actual = PasswordStrengthChecker.checkStrength(password);
        if (!expected.equals(actual)) {
            fail("[" + password + "]", expected, actual);
        }
    }

    private static void fail(String what, String expected, String actual) {
        failures++;
        System.out.println("FAIL " + what + ": expected [" + expected + "] got [" + actual + "]");
    }
}
