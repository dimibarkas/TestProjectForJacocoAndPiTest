package mutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void buildInstanceOfClass() {
        StringUtil su = new StringUtil();
    }

    @Test
    public void duplicateCharactersInString() {
        final String input = "abc";
        final String expectedOutput = "aabbcc";
        final String result = StringUtil.duplicateCharactersInString(input);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void checkIfExceptionIsThrown() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.duplicateCharactersInString(null);
        });

        assertEquals("str must not be null", thrown.getMessage());
    }
}