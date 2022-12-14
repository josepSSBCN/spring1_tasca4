package tempPackage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;


class tempStringTest {

    @Test
    void lengtString() {
        assertThat("Test de longitud diferent: ", "Mordor", lengthControl(is(8)));

    }

    @Test
    void lengthString2(){
        assertThat("Test de logitud igual: ","Mordorrr", lengthControl(is(8)));
    }

    /**
     * Matcher personalitzat
     * @param matcher
     * @return
     */
    public static Matcher<String> lengthControl(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher,"Test if length of a string ",
                "Test failed, input string ") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }
}