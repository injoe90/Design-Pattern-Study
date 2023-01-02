from abc import *


class Observer(metaclass=ABCMeta):
    @abstractmethod
    def update(self):
        pass


class Display(metaclass=ABCMeta):
    @abstractmethod
    def display(self):
        pass


class CurrentConditionDisplay(Observer, Display):
    def __init__(self, weatherData):
        self.__temperature = 0.0
        self.__humidity = 0.0
        self.__weatherData = weatherData
        self.__weatherData.registerObserver(self)

    def update(self):
        self.__temperature = self.__weatherData.getTemperature()
        self.__humidity = self.__weatherData.getHumidity()
        self.display()

    def display(self):
        print("현재 상태: 온도 " + str(self.__temperature) + "F, 습도 " + str(self.__humidity) + "%")


class ForecastDisplay(Observer, Display):
    def __init__(self, weatherData):
        self.__currentPressure = 29.2
        self.__lastPressure = 0.0
        self.__weatherData = weatherData
        self.__weatherData.registerObserver(self)

    def update(self):
        self.__lastPressure = self.__currentPressure
        self.__currentPressure = self.__weatherData.getPressure()
        self.display()

    def display(self):
        print("1시간 전 기압 : " + str(self.__lastPressure) + " 현재 기압 : " + str(self.__currentPressure))