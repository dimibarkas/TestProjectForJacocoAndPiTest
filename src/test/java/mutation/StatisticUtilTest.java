package mutation;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class StatisticUtilTest {

    @Test
    public void checkInstance() {
        StatisticUtil util = new StatisticUtil();
    }

    @Test
    public void checkIfGetAverageAgeWorksCorrect() throws LineHasWrongSyntaxException, IOException {
        String sampleString = "Bob;Builder;15\nAlice;Builder;21\nCharles;Drawing;24";
        InputStream stream = new ByteArrayInputStream(sampleString.getBytes());
        assertEquals(20.0, StatisticUtil.getAverageAge(stream), 0.0);
    }

    @Test
    public void getAverageAgeException() {
        String sampleString = "Bob;Builder\nAlice;Builder;21\nCharles;Drawing;24";
        InputStream stream = new ByteArrayInputStream(sampleString.getBytes());
        LineHasWrongSyntaxException thrown = assertThrows(LineHasWrongSyntaxException.class, () -> {
            StatisticUtil.getAverageAge(stream);
        });
        assertEquals(0,thrown.getLineNumber());
    }

    @Test
    public void getAverageAgeException2() {
        String sampleString = "Bob;Builder;a\nAlice;Builder;21\nCharles;Drawing;24";
        InputStream stream = new ByteArrayInputStream(sampleString.getBytes());
        LineHasWrongSyntaxException thrown = assertThrows(LineHasWrongSyntaxException.class, () -> {
            StatisticUtil.getAverageAge(stream);
        });
        assertEquals(0, thrown.getLineNumber());
    }
}