package main;

import java.util.ArrayList;
import java.util.Collections;

public class MonthsYear {
    // METHODS
    public ArrayList<String> monthsYear() {
        ArrayList<String> temp = new ArrayList<>();
        Collections.addAll(temp, "Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol",
                "Agost", "Setembre", "Octubre", "Novembre", "Decembre");
        return temp;
    }

}
