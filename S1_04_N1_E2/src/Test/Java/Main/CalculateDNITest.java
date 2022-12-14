package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDNITest {
    @Test
    void getLetter() {
        // https://www.letranif.com/
        CalculateDNI myCalculateDNI = new CalculateDNI();

        assertEquals('R', myCalculateDNI.getLetter(99999999));
        assertEquals('Z', myCalculateDNI.getLetter(23764810));
        assertEquals('E', myCalculateDNI.getLetter(49327317));
        assertEquals('K', myCalculateDNI.getLetter(78154205));
        assertEquals('J', myCalculateDNI.getLetter(57841218));
        assertEquals('H', myCalculateDNI.getLetter(15479570));
        assertEquals('C', myCalculateDNI.getLetter(34784185));
        assertEquals('Q', myCalculateDNI.getLetter(61897800));
        assertEquals('Y', myCalculateDNI.getLetter(80540601));
        assertEquals('V', myCalculateDNI.getLetter(11454730));


    }
}