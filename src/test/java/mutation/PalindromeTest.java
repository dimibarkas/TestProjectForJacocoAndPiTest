package mutation;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindromeTester = new Palindrome();

    @Test
    public void isPalindrome() {
        boolean result = palindromeTester.isPalindrome("noon");
        assertTrue(result);
    }

    @Test
    public void isPalindrome2() {
        boolean result = palindromeTester.isPalindrome("neon");
        assertFalse(result);
    }

    @Test
    public void isPalindrome3() {
        boolean result = palindromeTester.isPalindrome("box");
        assertFalse(result);
    }
}