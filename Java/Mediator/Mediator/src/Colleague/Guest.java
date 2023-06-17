package Colleague;

import Mediator.FrontDesk;

import java.time.LocalDateTime;

public class Guest {
    private Integer id;

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    private void requestDinner(LocalDateTime dateTime) {
        this.frontDesk.requestDinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
