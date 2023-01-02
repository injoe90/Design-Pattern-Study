from abc import *


class Subject(metaclass=ABCMeta):
    @abstractmethod
    def registerObserver(self, Observer):
        pass

    @abstractmethod
    def removeObserver(self, Observer):
        pass

    @abstractmethod
    def notifyObservers(self):
        pass


class WeatherData(Subject):
    def __init__(self):
        self.__observerList = []
        self.__temperature = 0.0
        self.__humidity = 0.0
        self.__pressure = 0.0

    def registerObserver(self, Observer):
        self.__observerList.append(Observer)

    def removeObserver(self, Observer):
        self.__observerList.remove(Observer)

    def notifyObservers(self):
        for observer in self.__observerList:
            observer.update()

    def measureChanged(self):
        self.notifyObservers()

    def setMeasurements(self, temperature: float, humidity: float, pressure: float):
        self.__temperature = temperature
        self.__humidity = humidity
        self.__pressure = pressure
        self.measureChanged()

    def getTemperature(self):
        return self.__temperature

    def getHumidity(self):
        return self.__humidity

    def getPressure(self):
        return self.__pressure
