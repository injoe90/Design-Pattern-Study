from Observer.Observer import CurrentConditionDisplay, ForecastDisplay
from Subject.Subject import WeatherData

if __name__ == '__main__':
    weatherData = WeatherData()
    currentConditionDisplay = CurrentConditionDisplay(weatherData)
    forecastDisplay = ForecastDisplay(weatherData)
    weatherData.setMeasurements(80.01, 65.41, 30.4)
    weatherData.setMeasurements(82.03, 70.11, 29.2)
    weatherData.setMeasurements(78.51, 90.41, 30.2)