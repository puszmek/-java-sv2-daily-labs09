package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String bandsName;
    private LocalDateTime startTime;
    private int price;

    public Ticket(String bandsName, LocalDateTime dateAndTime, int price) {
        this.bandsName = bandsName;
        this.startTime = dateAndTime;
        this.price = price;
    }

    public LocalTime entryTime() {
        return startTime.toLocalTime().minusHours(1);
    }

    public String getBandsName() {
        return bandsName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}
