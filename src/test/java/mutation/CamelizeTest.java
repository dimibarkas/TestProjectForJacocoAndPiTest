package mutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelizeTest {

    Camelize camelize = new Camelize();

    @Test
    public void camelize() {
        String result = camelize.camelize("Mein kleines Kamel");
        assertEquals("MeinKleinesKamel", result);
    }

    @Test
    public void camelizeReturnEmptyString() {
        assertEquals("", camelize.camelize(""));
    }
}
