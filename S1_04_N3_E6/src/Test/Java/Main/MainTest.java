package Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MainTest {
    static String[] citys;

    @BeforeAll
    public static void mainvoidmain(){
        // Construc the list
        String[] citys = new String[]{"Barcelona", "Sevilla", "Valencia"};
    }

    @Test
    void tesExcepction() {
        int i = 0;

        // Test 'ArrayIndexOutOfBoundsException'
        try {
            for (i = 0; i <= citys.length; i++) {
                System.out.println(citys[i]);
            }
        } catch (Exception ex) {
            assertThat(ex).isInstanceOf(ArrayIndexOutOfBoundsException.class);
        }
    }

    @Test
    void testExceptionOthers(){

        // Control an index
        assertThatCode(()->System.out.println(citys[2])).doesNotThrowAnyException();

    }
}