from Beverage.Beverage import *
from CondimentDecorator import *

if __name__ == "__main__":
    espresso = Espresso()
    print(espresso.getDescription() + " $" + str(espresso.cost()))

    beverage1 = DarkRost()
    beverage1 = Mocha(beverage1)
    beverage1 = Mocha(beverage1)
    beverage1 = Whip(beverage1)
    print(beverage1.getDescription() + " $" + str(beverage1.cost()))

    beverage2 = HouseBlend()
    beverage2.setSize(Beverage.cupSize.VENTI)

    beverage2 = Soy(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    print(beverage2.getDescription() + " $" + str(beverage2.cost()))