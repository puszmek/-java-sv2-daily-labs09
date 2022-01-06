package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    Concert concert = new Concert();
    Person person1 = new Person(new Ticket("Queen", LocalDateTime.of(2021, 11, 14, 20, 30), 24000));
    Person person2 = new Person(new FrontOfStageTicket("Queen", LocalDateTime.of(2021, 11, 14, 20, 30), 31000, "code1589ex"));

    @Test
    void testAddPerson() {
        concert.addPerson(person1, LocalTime.of(19, 30));
        concert.addPerson(person2, LocalTime.of(18, 30));
        assertEquals(2, concert.getPersonList().size());
    }

    @Test
    void testAddPerson1TooEarly() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> concert.addPerson(person1, LocalTime.of(19, 29)));
        assertEquals("Can not get in!", iae.getMessage());
    }

    @Test
    void testAddPerson2TooEarly() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> concert.addPerson(person2, LocalTime.of(18, 29)));
        assertEquals("Can not get in!", iae.getMessage());
    }
}