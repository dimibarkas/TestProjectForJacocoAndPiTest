package mutation;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }
}