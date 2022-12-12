package Main;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class MainTest {

    @Test
    void testArraysEquals(){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9);

        assertThat(list1).as("TEST LIST<INT> IGUALS").isNotEqualTo(list2);

    }

}