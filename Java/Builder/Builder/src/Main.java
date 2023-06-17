import Tour.TourPlan;
import TourBuilder.DefaultTourBuilder;
import TourBuilder.TourDirector;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}