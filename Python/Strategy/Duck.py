from Fly import *
from Quack import Quack


class Duck(metaclass=ABCMeta):
    def __init__(self):
        self.quackBehavior = None
        self.flyBehavior = None

    def performQuack(self):
        self.quackBehavior.quack()

    def performFly(self):
        self.flyBehavior.fly()

    @abstractmethod
    def display(self):
        pass

    def setQuackBehavior(self, newQuackBehavior):
        self.quackBehavior = newQuackBehavior

    def setFlyBehavior(self, newFlayBehavior):
        self.flyBehavior = newFlayBehavior

    def swim(self):
        print("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠")


class MallardDuck(Duck):
    def __init__(self):
        super().__init__()
        self.quackBehavior = Quack()
        self.flyBehavior = FlyWithWings()

    def display(self):
        print("저는 물오리입니다.")


class ModelDuck(Duck):
    def __init__(self):
        super().__init__()
        self.quackBehavior = Quack()
        self.flyBehavior = FlyNoWay()

    def display(self):
        print("저는 모형 오리입니다.")


if __name__ == '__main__':
    mallardDuck = MallardDuck()
    mallardDuck.performQuack()
    mallardDuck.performFly()

    print("=" * 50)

    modelDuck = ModelDuck()
    modelDuck.performQuack()
    modelDuck.performFly()
    modelDuck.setFlyBehavior(FlyRocketPowered())
    modelDuck.performFly()