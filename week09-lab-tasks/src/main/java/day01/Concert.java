package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person, LocalTime actualTime) {
        if (actualTime.isBefore(person.getTicket().entryTime())) {
            throw new IllegalArgumentException("Can not get in!");
        }
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
