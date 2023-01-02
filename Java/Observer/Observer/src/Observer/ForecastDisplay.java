package Observer;

import Subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private final WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("1시간 전 기압 : " + this.lastPressure
                         + " 현재 기압 : " + this.currentPressure);
    }

    @Override
    public void update() {
        this.lastPressure = currentPressure;
        this.currentPressure = weatherData.getPressure();
        display();
    }
}
