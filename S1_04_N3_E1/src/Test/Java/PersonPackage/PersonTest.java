package PersonPackage;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.BDDAssertions.then;


class PersonTest {

    @Test
    void testObjectsEqualsWithAssertthatAndMatches(){
        Person person1 = new Person("Marcos", "Gonzalez", "48751517-G");
        Person person2 = new Person("Marcos", "Gonzalez", "48751517-G");

        assertThat(person1).as("TEST AMB 'ASSERTHAT' I MATCHES").withFailMessage("Els 2 objectes son diferents!").matches(p -> p.equals(person2),
                "Es realitza la comparació fent servir el Matches.");

    }

    @Test
    void testObjectsEqualsWithThenAndComparator(){
        Person person1 = new Person("Marcos", "Gonzalez", "48751517-G");
        Person person2 = new Person("Marcos", "Gonzalez", "48751517-G");

        then(person1).as("TEST AMB 'THEN' I COMPARATOR").withFailMessage("Els 2 objectes son diferents!").usingComparator(
                Comparator.comparing(Person::getName).thenComparing(Person::getSurname).thenComparing(Person::getDni),
                "Es realitza la comparació fent servir el Comparator.").isEqualTo(person2);

    }

    @Test
    void testObjectsNotEqualsWithAssertthatAndMatches(){
        Person person1 = new Person("Marcos", "Gonzalez", "48751517-G");
        Person person2 = new Person("Eva", "Peron", "41795204-H");

        assertThat(person1).as("TEST AMB 'ASSERTHAT' I MATCHES").withFailMessage("Els 2 objectes son diferents.")
                .matches(p -> !p.equals(person2), "Es realitza la comparació fent servir el Matches.");

    }

    @Test
    void testObjectsNotEqualsWithThenAndComparator(){
        Person person1 = new Person("Marcos", "Gonzalez", "48751517-G");
        Person person2 = new Person("Eva", "Peron", "41795204-H");

        then(person1).as("TEST AMB 'THEN' I COMPARATOR").withFailMessage("Els 2 objectes son diferents.").
                usingComparator(Comparator.comparing(Person::getName).
                thenComparing(Person::getSurname).thenComparing(Person::getDni),
                "Es realitza la comparació fent servir el Comparator").isNotEqualTo(person2);

    }

}



