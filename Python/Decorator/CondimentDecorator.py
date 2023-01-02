from abc import *

from Beverage.Beverage import Beverage


class CondimentDecorator(Beverage, metaclass=ABCMeta):
    beverage = None

    @abstractmethod
    def getDescription(self):
        pass

    def getSize(self):
        return self.cupSize


class Soy(CondimentDecorator):
    def __init__(self, beverage):
        self.beverage = beverage

    def cost(self):
        cost = self.beverage.cost()

        if self.beverage.getSize() == self.cupSize.TALL:
            cost += 0.1
        elif self.beverage.getSize() == self.cupSize.GRANDE:
            cost += 0.15
        elif self.beverage.getSize() == self.cupSize.VENTI:
            cost += 0.2

        return cost

    def getDescription(self):
        return self.beverage.getDescription() + ", 두유"


class Mocha(CondimentDecorator):
    def __init__(self, beverage):
        self.beverage = beverage

    def cost(self):
        return self.beverage.cost() + 0.2

    def getDescription(self):
        return self.beverage.getDescription() + ", 모카"


class Whip(CondimentDecorator):
    def __init__(self, beverage):
        self.beverage = beverage

    def cost(self):
        return self.beverage.cost() + 0.25

    def getDescription(self):
        return self.beverage.getDescription() + ", 휘핑크림"

