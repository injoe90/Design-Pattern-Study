from abc import *
from enum import Enum


class Size(Enum):
    TALL = 1
    GRANDE = 2
    VENTI = 3


class Beverage(metaclass=ABCMeta):
    cupSize = Size
    description = "No Title"

    def getDescription(self):
        return self.description

    def setSize(self, size):
        self.cupSize = size

    def getSize(self):
        return self.cupSize

    @abstractmethod
    def cost(self):
        pass


class HouseBlend(Beverage):

    def __init__(self):
        self.description = "하우스 블랜드 커피"

    def cost(self):
        return 0.89


class Espresso(Beverage):
    def __init__(self):
        self.description = "에스프레소"

    def cost(self):
        return 1.99


class DarkRost(Beverage):
    def __init__(self):
        self.description = "다크 로스트 커피"

    def cost(self):
        return 0.84

