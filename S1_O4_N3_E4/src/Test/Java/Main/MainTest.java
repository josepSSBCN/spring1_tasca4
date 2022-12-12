package Main;

import ObjectsPackage.Bus;
import ObjectsPackage.Car;
import ObjectsPackage.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Collections.list;
import static org.assertj.core.api.Assertions.*;


class MainTest {

    static ArrayList<Object> objectsList;
    static Person person1, person2;
    static Car car1, car2, car3;
    static Bus bus1, bus2;


    @BeforeAll
    public static void createList() {

        // Create objects
        objectsList = new ArrayList();
        person1 = new Person("Marcos", "Gonzalez", "48751517-G");
        person2 = new Person("Eva", "Peron", "41795204-H");
        car1 = new Car("Formentor", 300, 150);
        car2 = new Car("Leon Cupra", 300, 85);
        car2 = new Car("Born", 231, 85);
        bus1 = new Bus(25, 37, 2);
        bus2 = new Bus(27, 75, 15);


        // Add objects to list
        objectsList.add(bus1);
        objectsList.add(car1);
        objectsList.add(person1);
        objectsList.add(bus2);
        objectsList.add(car2);
        objectsList.add(person2);

    }


    @Test
    void testArrayListObjectsInOrder() {
        assertThat(objectsList).as("TEST OBJECTES EN AQUEST ORDRE").containsExactly(bus1, car1, person1, bus2, car2, person2);

    }

    @Test
    void testArrayListHaveObjects() {
        assertThat(objectsList).as("TEST OBJECTES EN QUALSEVOL ORDRE").contains(bus1, bus2, car1, car2, person1, person2);

    }


    @Test
    void testArrayListObjectOnce() {
        assertThat(objectsList).as("TEST CONTE CAR2 1 SOL COP").containsOnlyOnce(car2);


    }

    @Test
    void testArrayListNotContainObject(){
        assertThat(objectsList).as("TEST NO CONTE CAR3").doesNotContain(car3);
    }

}