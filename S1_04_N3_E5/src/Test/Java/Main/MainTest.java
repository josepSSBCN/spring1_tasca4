package Main;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

////*import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void testHashMap(){
        // Construc HashMap
        Map<String, String> capitals = new HashMap<String, String>();
        capitals.put("Anglaterra","Londres");
        capitals.put("Alemanya","Berlin");
        capitals.put("França","Paris");
        capitals.put("Espanya","Madriz");

        // Exist
        assertThat(capitals).extractingByKey("Espanya").isNotNull();

        // Not Exist
        assertThat(capitals).extractingByKey("Italia").isNull();

    }





}