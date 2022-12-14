package Main;

import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.Test;


import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MainTest {

    @Test
    void testEmptyObject(){
        // Create Optional Objects
        Optional<String> myOptional = Optional.of("");
        Optional<String> myOptional2 = Optional.of("Hola que tal?");
        Optional<String> myOptional3 = null;

        // Test
        assertThat(myOptional).get(as(InstanceOfAssertFactories.STRING)).isEmpty();

        // Other tests
        assertThat(myOptional2).get(as(InstanceOfAssertFactories.STRING)).isNotNull();
        assertThat(myOptional3).isNull();
    }
}