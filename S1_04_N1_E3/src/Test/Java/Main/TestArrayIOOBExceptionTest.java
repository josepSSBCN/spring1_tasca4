package Main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestArrayIOOBExceptionTest {

    @Test
    @DisplayName("TEST EXCEPTION: ArrayIndexOutOfBoundsException")
    public void testArrayIOOBExceptionTest(){
        // TEST EXCEPTION: ArrayIndexOutOfBoundsException
        ArrayIndexOutOfBoundsException myException = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> new TestArrayIOOBException(),
                "No s'ha llançat la exepció ArrayIndexOutOfBoundsException");
    }

}