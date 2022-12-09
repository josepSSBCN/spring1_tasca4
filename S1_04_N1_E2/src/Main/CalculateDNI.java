package Main;

import org.testng.annotations.Test;
public class CalculateDNI {
    // ATTRIBUTES
    private final char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    // METHODS
    public char getLetter(int newNum) {
        // DEFINITION VARIABLES
        int position;

        // ACTIONS
        position = newNum % 23;

        // OUT
        return this.letters[position];

    }

}


