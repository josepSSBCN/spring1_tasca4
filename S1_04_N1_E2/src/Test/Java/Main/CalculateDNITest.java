package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDNITest {
    @Test
    void getLetter() {
        CalculateDNI myCalculateDNI = new CalculateDNI();

        assertEquals('R', myCalculateDNI.getLetter(99999999));

    }
}