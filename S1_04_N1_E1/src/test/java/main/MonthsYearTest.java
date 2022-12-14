package main;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class MonthsYearTest {
    @Test
    void monthsYear() {
        // DEFINITION VARIABLES
        MonthsYear myMonthsYear = new MonthsYear();
        ArrayList<String> moths = new ArrayList<String>();
        moths = myMonthsYear.monthsYear();

        // ACTIONS
        // Check if the arrayList is null
        assertNotNull(moths);

        // Check if the arrayList's size is 12
        assertEquals(12, moths.size());

        // Check if the position 8 is 'Agost'
        assertEquals("Agost", moths.get(7));

    }
}