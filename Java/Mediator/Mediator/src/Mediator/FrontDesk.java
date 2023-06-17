package Mediator;

import Colleague.CleaningService;
import Colleague.Guest;
import Colleague.Restaurant;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();
    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void requestDinner(Guest guest, LocalDateTime dateTime) {
        restaurant.makeReservation(guest.getId(), dateTime);
    }
}
