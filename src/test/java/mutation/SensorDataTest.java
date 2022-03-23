package mutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SensorDataTest {

    SensorData standardConstructor = new SensorData();

    SensorData sensorData = new SensorData(2.2, 2.1);

    @Test
    public void add() {
        sensorData.add(2.0);
        assertEquals(3, sensorData.getSize());
    }

    @Test
    public void getSize() {
        int size = sensorData.getSize();
        assertEquals(2, size);
    }

    @Test
    public void clear() {
        sensorData.clear();
        assertEquals(0,sensorData.getSize());
    }

    @Test
    public void get() {
        double data = sensorData.get(1);
        assertEquals(2.1, data, 0.001);
    }

    @Test
    public void getMinimum() throws EmptySensorArrayException {
        double data = sensorData.getMinimum();
        assertEquals(2.1, data, 0.001);
    }

    @Test
    public void getMinimumThrowsException() {
        EmptySensorArrayException thrown = assertThrows(EmptySensorArrayException.class, () -> {
            standardConstructor.getMinimum();
        });
        assertEquals("Cannot determine minimum of sensor values because no values exist.", thrown.getMessage());
    }

    @Test
    public void getMaximum() throws EmptySensorArrayException {
        double data = sensorData.getMaximum();
        assertEquals(2.2, data, 0.001);
    }

    @Test
    public void getMaximumThrowsException() {
        EmptySensorArrayException thrown = assertThrows(EmptySensorArrayException.class, () -> {
            standardConstructor.getMaximum();
        });
        assertEquals("Cannot determine maximum of sensor values because no values exist.", thrown.getMessage());
    }

    @Test
    public void getAverage() throws EmptySensorArrayException {
        double avg = sensorData.getAverage();
        assertEquals(2.15, avg, 0.001);
    }

    @Test
    public void getAverageThrowsException() {
        EmptySensorArrayException thrown = assertThrows(EmptySensorArrayException.class, () -> {
            standardConstructor.getAverage();
        });
        assertEquals("Cannot determine average of sensor values because no values exist.", thrown.getMessage());
    }

}